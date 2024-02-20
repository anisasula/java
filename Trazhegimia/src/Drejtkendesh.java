/**
 * Klasa Drejkendesh zgjeron klasen ObjektGjeometrik pasi nje 
 * drejtkendesh eshte nje Objekt Gjeometrik.Drejtkendeshi ka dy fusha:
 * brinja1 dhe brinja2
 * Perimetri = 2*(brinja1 +brinja2)
 * Siperfaqa = 2*(brinja1 +brinja2)
 */
public class Drejtkendesh extends ObjektGjeometrik {
private double brinja1=1.0;
private double brinja2=2.0;

public Drejtkendesh() {
	super();
}

/**
 * @param ngjyra
 * @param ngjyrosur
 * @param brinja1
 * @param brinja2
 */
protected Drejtkendesh(String ngjyra, boolean ngjyrosur,double brinja1,double brinja2) {
	super(ngjyra, ngjyrosur);
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
@Override
public double getPerimeter() {
	return  2*(brinja1 +brinja2);
}
@Override
public double getSiperfaqe() {
	return 2*(brinja1 +brinja2);
}
@Override
public String toString() {
	return   String.format("Drejtkendeshi me  brinje %.2f,%.2f\n",brinja1,brinja2)+ super.toString();
}
}
