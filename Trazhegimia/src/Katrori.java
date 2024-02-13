/**Klasa katror zgjeron klasen drejtkendesh
 * perimetri= 4*brinja1;
 * siperfaqa= brinja1*brinja1
 * 
 */

public class Katrori extends Drejtkendesh {
	private double brinja1=1.0;
	private double brinja2=1.0;
	
	public Katrori() {
		super();
	}

	/**
	 * @param ngjyra
	 * @param ngjyrosur
	 * @param brinja1
	 * @param brinja2
	 */
	protected Katrori(String ngjyra, boolean ngjyrosur, double brinja1, double brinja2) {
		super(ngjyra, ngjyrosur, brinja1, brinja2);
		this.brinja1=brinja1;
		this.brinja2=brinja2;
	}

	/**
	 * @return the brinja1
	 */
	public double getBrinja1() {
		return brinja1;
	}
	/**
	 * @param brinja1 the brinja1 to set
	 */
	public void setBrinja1(double brinja1) {
		this.brinja1 = brinja1;
	}
	/**
	 * @return the brinja2
	 */
	public double getBrinja2() {
		return brinja2;
	}
	/**
	 * @param brinja2 the brinja2 to set
	 */
	public void setBrinja2(double brinja2) {
		this.brinja2 = brinja2;
	}
	public double getPerimetri() {
		return 2*(brinja1+brinja2);
	}
	public double getSiperfaqe() {
		return brinja1*brinja2;
	}

	@Override
	public String toString() {
		ObjektGjeometrik o1=(ObjektGjeometrik)this;
		return  String.format("Katrori me  brinje %.2f,%.2f\n",this.getBrinja1()).toString();
	}
}
