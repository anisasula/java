
public class Person {
	
protected String emri;
protected String adresa;
protected String telefoni;
protected String email;

public Person() {
}
public Person(String emri,String adresa,String telefoni,String email) {
	this.emri=emri;
	this.adresa=adresa;
	this.telefoni=telefoni;
	this.email=email;
}


public String getEmri() {
	return emri;
}

public void setEmri(String emri) {
	this.emri = emri;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public String getTelefoni() {
	return telefoni;
}

public void setTelefoni(String telefoni) {
	this.telefoni = telefoni;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return  String.format("Emri: %s\nAdresa : %s\nTelefoni :%s\nEmail :%s\n",emri,adresa,telefoni,email);
	
}


}
