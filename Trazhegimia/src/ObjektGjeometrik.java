import java.util.Date;

public class ObjektGjeometrik {
	private String ngjyra;
	private boolean ngjyrosur;
	private Date dataKrijimit;

	/**
	 * konstruktori default
	 */
	public ObjektGjeometrik() {
		this.dataKrijimit = new Date();
	}
	
	public ObjektGjeometrik(String ngjyra, boolean ngjyrosur) {
		this();
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
	

	
	
	
	
	
	
}
