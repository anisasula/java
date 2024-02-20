/**
 * kur nje klase deklarohet abstrakte kjo klase nuk mund te inicializohet dhe per kete arsye do te merrni errore
 * tek klasa TestObjektGjeometrik.Klasat abstarkte mund te kene konstruktor qe mund te perdoren 
 * nga nenkalsat dhe mund te kene dhe metoda konkrete qe mund te perdoren nga nenklasat gjithashtu.
 */
import java.util.Date;

public abstract class ObjektGjeometrik extends Object {
	private String ngjyra;
	private boolean ngjyrosur;
	private Date dataKrijimit;

	/**
	 * konstruktori default
	 */
	public ObjektGjeometrik() {
		System.out.println("Konstruktori pa parametra i klases ObjektGjeometrik");
		this.dataKrijimit = new Date();
	}
	
	public ObjektGjeometrik(String ngjyra, boolean ngjyrosur) {
		this();//therret konstruktorin default
		System.out.println("Konstruktori me parametra i klases ObjektGjeometrik");
		this.ngjyra = ngjyra;
		this.ngjyrosur = ngjyrosur;
	}

	public String getNgjyra() {
		return ngjyra;
}

	public void setNgjyra(String ngjyra) {
		this.ngjyra = ngjyra;
}

	public boolean isNgjyrosur() {
		return ngjyrosur;
}

	public void setNgjyrosur(boolean ngjyrosur) {
		this.ngjyrosur = ngjyrosur;}

	public Date getDataKrijimit() {return dataKrijimit;}
	
	@Override
	public String toString() {
		return String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s\n",
				getDataKrijimit(),getNgjyra(),isNgjyrosur());	
}
	//getSiperfaqe duhet te jete nje metode abstrakte
	//duhet te kete nje implementim konkret te nenklasat,duhet bere override.
	public abstract  double getSiperfaqe();
	
	public abstract  double getPerimeter() ;
}
