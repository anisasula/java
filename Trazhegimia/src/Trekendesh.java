
public class Trekendesh extends ObjektGjeometrik {
	
	private double brinja1=1.0;
	private double brinja2=1.0;
	private double brinja3=1.0;
	public Trekendesh() {
		super();
		System.out.println("Konstruktori pa parametra i klases Trekendesh");
	}
	/**
	 * @param ngjyra
	 * @param ngjyrosur
	 * @param brinja1
	 * @param brinja2
	 * @param brinja3
	 * @throws IllegalArgumentException kur njera nga brinjet eshte negative
	 */
	protected Trekendesh(String ngjyra, boolean ngjyrosur,double brinja1, double brinja2, double brinja3) {
		super(ngjyra, ngjyrosur);
		System.out.println("Konstruktori me parametra i klases Trekendesh");
		
		
		if(brinja1<=0 || brinja2<=0 || brinja3<=0)
			throw new IllegalArgumentException("Njera nga brinjet eshte negative");
		this.brinja1=brinja1;
		this.brinja2=brinja2;
		this.brinja3=brinja3;	
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
		if( brinja2<=0 || brinja3<=0)
			throw new IllegalArgumentException("Njera nga brinjet eshte negative");
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
		if(brinja1<=0 ||  brinja3<=0)
			throw new IllegalArgumentException("Njera nga brinjet eshte negative");
	}

	/**
	 * @return the brinja3
	 */
	public double getBrinja3() {
		return brinja3;
	}

	/**
	 * @param brinja3 the brinja3 to set
	 */
	public void setBrinja3(double brinja3) {
		this.brinja3 = brinja3;
		if(brinja1<=0 || brinja2<=0)
			throw new IllegalArgumentException("Njera nga brinjet eshte negative");
	}
	/**
	 * llogarit perimetrin e trekendeshit
	 * @return brinja1 + brinja2 + brinja3
	 */
	@Override
	public double getPerimeter() {
		return brinja1+brinja2+brinja3;
	}
	/**
	 * llogarit siperfaqen e trekendeshit sipas formules se Heronit
	 * @return siperfaqja e  trekendeshit
	 */
	@Override
	public double getSiperfaqe() {
		double hp=getPerimeter()/2.0; //gjysem perimeter
		return Math.sqrt(hp*(hp-brinja1)*(hp-brinja2)*(hp-brinja3));
	}

	@Override
	public String toString() {
		return   String.format("Trekendesh me brinje %.2f, %.2f, %.2f\n",brinja1,brinja2,brinja3)+ super.toString();
	}
	
	
}
