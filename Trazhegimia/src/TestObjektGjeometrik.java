
public class TestObjektGjeometrik {

	public static void main(String[] args) {
		//meqe klasa eshte abstarkte nuk mund te krijohet nje objekt konkret nga superklasa
	ObjektGjeometrik o = new Trekendesh("kuqe",true,3,4,5);
	o.setNgjyra("jeshile");
	System.out.println(o.toString());

	}

}
