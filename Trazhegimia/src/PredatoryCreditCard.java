/**
 * klasa Predatory CreditCard zgjeron klasen CreditCard ne dy menyra:
 * (1) nëse një kreditim i tentuar refuzohet sepse do të kishte tejkaluar kufirin e
 * fushës limit, një tarifë prej 5 euro do te shtohet ne balancën e kartës 
 *
 * (2)do të ketë një mekanizëm për llogaritjen e tarifës mujore bazuar ne balancën e
 * kartës, duke përdorur një interes përqindjeje vjetore i specifikuar si një
 * parametër i ri ne konstruktorin e klasës.
 * 
 * @author User
 */
/**
 * fjala kyce extends krijon nje nenklase te klases CreditCard
 * themi se CreditCard eshte nje superklase e PredatoryCreditCard
 * dhe PredatoryCreditCard eshte nenklase e CreditCard
 * Trazhegimia shton nje marredhenie qe njihet si "eshte-nje"
 * Kemi qe nje PredatoryCreditCard "eshte-nje" CreditCard
 * Nenklasa trazhegon te gjitha variablat e instances dhe metodat e superklases
 * E vetmja gje qe nuk trazhegohet eshte konstruktori i superklases
 * Nese duam te therrasim konstruktorin e superklases duhet te perdorim fjalen kyce super()
 * Te gjitha variablat privat te superklases mbeten te pa aksesushem tek nenklasa mund te aksesohen vetem nepermjet metodave publike
 * Nese duam qe nje fushe private ta aksesojme brenda nneklases duhet ta ndryshojme ne protected.
 * 
 */
public class PredatoryCreditCard  extends CreditCard{
	private double  apr; //annual proccesing rate,perdoret per llogaritjen e tarifes mujore

	/**
	 * 
	 */
	protected PredatoryCreditCard() {
		super();
 	}

	/**
	 * @param costumer
	 * @param bank
	 * @param account
	 * @param limit
	 * @param balance
	 */
	protected PredatoryCreditCard(String costumer, String bank, String account, int limit, double balance , double apr) {
		super(costumer, bank, account, limit, balance);
		this.apr=apr;
	}

	public double getApr() {return apr;}
	public void setApr(double apr) {this.apr = apr;}
	
	@Override
	public boolean charge(double amount) {
		if(super.charge(amount)==false) {
			this.setBalance(this.getBalance()+5);
			return false;
		}
		return true;
	}
	/**
	 * metode e re specifike per kete klase e cila njehere ne muaj aplikon interes mujor
	 * ne baze te detyrimeve qe ka klienti
	 */
	public void processMonthly() {
		double intetes =Math.pow(1+apr, 1/12.0)*getBalance();
		setBalance(intetes + this.getBalance());
}
	
}
	