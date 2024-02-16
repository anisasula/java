import java.util.Calendar;
import java.util.Date;

public class Punonjes extends Person {
protected String zyra;
protected double paga;
protected Data dataPunesimit;

public Punonjes() {
	
}

public Punonjes(String emri,String adresa, String telefoni,String email,String zyra,double paga, Data dataPunesimit) {
	super(emri,adresa,telefoni,email);
	this.zyra=zyra;
	if(paga>=0)this.paga=paga;
	this.dataPunesimit=dataPunesimit;
	
}

/**
 * @return the zyra
 */
public String getZyra() {
	return zyra;
}

/**
 * @param zyra the zyra to set
 */
public void setZyra(String zyra) {
	this.zyra = zyra;
}

/**
 * @return the paga
 */
public double getPaga() {
	return paga;
}

/**
 * @param paga the paga to set
 */
public void setPaga(double paga) {
	if(paga>=0)
	this.paga = paga;
}

/**
 * @return the dataPunesimit
 */
public Data getDataPunesimit() {
	return dataPunesimit;
}

/**
 * @param dataPunesimit the dataPunesimit to set
 */
public void setDataPunesimit(Data dataPunesimit) {
	this.dataPunesimit = dataPunesimit;
}

@Override
public String toString() {
	return super.toString() + String.format("Zyra %s\nPaga %.2f\nData e Punesimit %s\nVitet e Punes %s\n ",zyra,paga,
			dataPunesimit.toString(),getVitetPunesimit());
}
public int getVitetPunesimit() {
	//to do
	// Te perdoret klasa java.util.Date ose LocalDate per te marre daten korente
	// dhe per te bere extract vitin korent. Mosha llogaritet
	// si diference midis vitit korent dhe vitit te lindjes

	Calendar cal = Calendar.getInstance();
	cal.setTime(new Date());
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	if(this.getDataPunesimit().getMuaj()<= month)
	    return year - this.getDataPunesimit().getViti() ;
	else 
		return year - this.getDataPunesimit().getViti() - 1;	
} 
/**
 * rishikon pagen ne varesi te vjetersise(me e madhe se 5 vite)
 * @return true nese punonjesi ploteson kriteret
 */
public boolean rishikoPagen() {
	if(getVitetPunesimit()<5)return false;
	
	this.setPaga(paga*1.1);
	return true;
	
}

}
