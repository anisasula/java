/**klasa Rrethi zgjeron klasen ObjektGjeometrik asi nje rreth "eshte-nje" objekt gjeometrik
 * Rrethi ka fushen rrezja te tipi double me vlere default 1.0
 * Ka metodat getPerimeter(),getSiperfaqe(),toString()
 * Perimetri  = 2 * pi * rrezja
 * Siperfaqja = pi * rrezja * rrezja
 * @author User
 */

public class Rrethi extends ObjektGjeometrik {
	private double rrezja  = 1.0;
	
	public Rrethi() {
		super();
	}

	/**
	 * @param ngjyra
	 * @param ngjyrosur
	 * @param brinja1
	 * @param brinja2
	 */
	protected Rrethi(String ngjyra, boolean ngjyrosur, double rrezja) {
		super(ngjyra, ngjyrosur);
		
		this.rrezja=rrezja;
	}

	/**
	 * @return the rrezja
	 */
	public double getRrezja() {
		return rrezja;
	}

	/**
	 * @param rrezja the rrezja to set
	 */
	public void setRrezja(double rrezja) {
		this.rrezja = rrezja;
	}
	/**
	 * llogarit perimetrin e rrethit
	 * @return 2 * pi * rrezja
	 */
	public double getPerimeter() {
		return 2 * Math.PI * rrezja;
	}
	/**
	 * llogarit siperfaqen e rrethit
	 * @return siperfaqja e  rrethit
	 */
	public double getSiperfaqe() {
		return Math.PI * rrezja * rrezja;
	}

	@Override
	public String toString() {
		return   String.format("Rrethi me rreze %.2f\n",rrezja)+ super.toString();
	}
	

}
