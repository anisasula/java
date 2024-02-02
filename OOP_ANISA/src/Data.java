

/**
	 * klasa Data perbehet per te modeluar nje date te vitit
	 * @author Anisa
	 * @version 1.0
	 */
	
public class Data {
	private int dita;
	private int muaj;
	private int viti;

	
/**
 * konstruktori pa parametra qe nderton nje date default 
 * 1/1/1970
 * muajt me 31;Janar,Mars,Maj,Korrik,Gusht,Tetor,Dhjetor
 * muajt me 30;Prill,Qershor,Shtator,Nentor
 * muajt me 28 ose 29;Shkurt
 * viti quhet i brishte nese numri qe perfaqeson plotpjestohet me 4 por jo me 100 ose plotpjestohet me 400
 */
	
 public Data() {
	this.dita =1;
	this.muaj = 1;
	this.viti = 1970;
	 
 }

public Data(int dita, int muaj, int viti) {
	if(kontrollData(dita, muaj, viti)) {
	this.dita=dita;
	this.muaj=muaj;
	this.viti=viti;
	}
	else {
		this.dita =1;
		this.muaj = 1;
		this.viti = 1970;
		
	}
}
private boolean kontrollData(int dita,int muaj,int viti) {
	if(dita<=0 || dita >31 || muaj<=0 || muaj>12 || viti<=0) return false;
	if ((muaj==4 || muaj==6 || muaj==9 || muaj==1)&&dita >30)  return false;
	if(muaj==2 &&dita>29) return false;
	if(!vitiBrishte(viti) &&muaj==2 &&dita>28 ) return false;
	return true;	
}
/**
 * viti quhet i brishte kur nr i vitit plotpjestohet me 4 dhe 400 por jo me 100
 * @param viti perfaqeson vitin
 * @return true nese viti eshte i brishte,false perndryshe
 */
private boolean vitiBrishte(int viti) {
	if(viti%4==0 && viti%100!=0 || viti%400==0)
		return true;
	else return false;
}
/**
 * 
 * @return dita variabli i instances dita
 */

public int getDita() {
	return dita;
}

public void setDita(int dita) {
	if(kontrollData(dita, this.muaj, this.viti))
	this.dita = dita;
}

public int getMuaj() {
	return muaj;
}

public void setMuaj(int muaj) {
	if(kontrollData(this.dita, muaj, this.viti))
	this.muaj = muaj;
}

public int getViti() {
	return viti;
}

public void setViti(int viti) {
	if(kontrollData(this.dita, this.muaj, viti))
	this.viti = viti;
}
/**
 * afishon daten ne formatin dd/mm/yyyy
 */
public void afishoDaten() {
	String dita;
	String muaj;
	String data;
	if(getDita()<10)
		dita ="0" +getDita();
	else 
		dita = "" +getDita();
	if(getMuaj()<10)
		muaj="0"+getMuaj();     
	else
		muaj ="" +getMuaj();
	data = dita+"/"+muaj+"/"+getViti();
	System.out.println(data);
	}

}
