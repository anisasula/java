enum Grada {LEKTOR,ASISENT_PROFESOR,PROFESOR_ASOCIUAR,DOKTOR,PROFESOR};
public class Fakulteti extends Punonjes {
	private int oretQendrimitZyre;
	private Grada grada;
	
	/**
	 * @param j 
	 * @param profesor 
	 * @param data 
	 * @param i 
	 * @param string5 
	 * @param string4 
	 * @param string3 
	 * @param string2 
	 * @param string 
	 * 
	 */
	public Fakulteti(String string, String string2, String string3, String string4, String string5, int i, Data data, Grada profesor, int j) {
		super();
	}
	/**
	 * @param emri
	 * @param adresa
	 * @param telefoni
	 * @param email
	 * @param zyra
	 * @param paga
	 * @param dataPunesimit
	 * @param oretQendrimitZyre
	 * @param grada
	 */
	public Fakulteti(String emri, String adresa, String telefoni, String email, String zyra, double paga,
			Data dataPunesimit,int oretQendrimitZyre,Grada grada) {
		super(emri, adresa, telefoni, email, zyra, paga, dataPunesimit);
		this.oretQendrimitZyre=oretQendrimitZyre;
		this.grada=grada;
		
	}
	/**
	 * @return the oretQendrimitZyre
	 */
	public int getOretQendrimitZyre() {
		return oretQendrimitZyre;
	}
	/**
	 * @param oretQendrimitZyre the oretQendrimitZyre to set
	 */
	public void setOretQendrimitZyre(int oretQendrimitZyre) {
		if(oretQendrimitZyre<=0)this.oretQendrimitZyre = oretQendrimitZyre;
	}
	/**
	 * @return the grada
	 */
	public Grada getGrada() {
		return grada;
	}
	/**
	 * @param grada the grada to set
	 */
	public void setGrada(Grada grada) {
		this.grada = grada;
	}
	@Override
	public String toString() {
	
		return super.toString()+String.format("Grada %s\nOret e Qendrimit ne Zyre %s\n",grada.name(),oretQendrimitZyre);
	}
	/**
	 * rishkruan metoden e superklases per gradat profesor,doktor,profesor_asociuar pavaresisht 
	 * viteve te punes aplikohet shtesa prej 15%. per gradat e tjera apliko shtese prej 10%
	 * pavaresisht viteve te punes
	 * @return true ose false
	 */
	@Override
	public boolean rishikoPagen() {
		switch(grada) {
		case 
		PROFESOR,
		DOKTOR,
		PROFESOR_ASOCIUAR:
			this.setPaga(paga * 1.5);
		return true;
		default:
			return super.rishikoPagen();
		}
	}

}
