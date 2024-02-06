
import java.util.Calendar;
import java.util.Date;

/**
 * klasa punonjes modelon nje punonjes te nje kompanie.
 * @author Anisa
 * @version 1.0
 * 
 * 
 */
public class punonjes {

	private String Emri; //emri i punonjesit
    private String Mbiemri; //mbiemri i punonjesit
	private double pagaMujore; //tregon pagen mujore te punonjesit
	private boolean paga13 = false; //tregon pagen e 13
	private static  int nrPunonjes=0;
	private Data dataLindjes; //procesi i agregimit
	
	public punonjes() {	
		nrPunonjes++;
	}
	
	/**
	 * qellimi:nderton nje objekt te klases punonjes me parametrat e specifikuar me poshte
	 * nese pagaMujore eshte negative vlera default 0 do vendoset
	 * 
	 * @param Emri emri i punonjesit
	 * @param Mbiemri mbiemri i punonjesit
	 * @param pagaMujore paga mujore e punonjesit
	 */
	public punonjes(String Emri,String Mbiemri,double pagaMujore) {
		setEmri(Emri);
		setMbiemri(Mbiemri);
		setPagaMujore(pagaMujore);
		if(pagaMujore>0.0)setPagaMujore(pagaMujore);
		nrPunonjes++;
	}
	
	
	
	
	/**
	 * metoda get per emrin e punonjesit
	 * @return emri i punonjesit
	 */
	public String getEmri() {return Emri;}
	/**
	 * metoda set per fushen emri
	 * @param emri vendos emrin e punonjesit
	 */
	public void setEmri(String emri) {this.Emri = emri;}
	public String getMbiemri() {return Mbiemri;}   
	public void setMbiemri(String mbiemri) {this.Mbiemri = mbiemri;}
	public double getPagaMujore() {return pagaMujore;}
	public void setPagaMujore(double pagaMujore) {this.pagaMujore = pagaMujore;}
	public boolean getPaga13() {return paga13;}
	public void setPaga13(boolean paga13) {this.paga13 = paga13;}
	public static int getNrPunonjes() {return nrPunonjes;}

	/**
	 * llogarit pagen vjetore ne baze te pages mujore
	 * @return 12 pagat plus pagen e 13 nese fusha paga13 eshe true
	 */
	public double  getPagaVjetore() {return getPaga13()? getPagaMujore()*13:getPagaMujore()*12;}  //shkurtimi ii struktures if else 
	
	
	public Data getDataLindjes() {
	      return dataLindjes;
	}
	
	public void setDataLindjes (Data dataLindjes) {
			this.dataLindjes=dataLindjes;
	}

	public static void afishoPunonjes(punonjes punonjes) {
		if(punonjes!=null) System.out.printf("%-9s%-13s%11.2f\n",
				punonjes.getEmri(),
				punonjes.getMbiemri(),
				punonjes.getPagaVjetore()
				);
	}
	/**
	 * metoda llogarit dhe kthen moshen e punonjesit
	 * @return mosha ne vite e punonjesit
	 */
	public int getMosha() {
		//to do : te perdoret klasa java.util.date ose local date  per te marre daten
		//koherente dhe per te afishuar dhe per te bere ekstarkt vitin koherent.
		//mosha llogaritet si diference mes vitit koherent dhe vitit te lindjes
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date ());
		int year= cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		if (this.getDataLindjes().getMuaj()< month)
			return year - this.getDataLindjes().getViti();
		else		
					return year -this.getDataLindjes().getViti()-1;	       

	}
	}
			
	
