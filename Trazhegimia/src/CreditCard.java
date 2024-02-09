/**
 * klasa VCreditCard modelon nje karte krediti konsumatori
 * @author User
 */
public class CreditCard {
protected String costumer; //emri i klientit
protected String bank; //emri i bankes
protected String account; // numri i llogarise qe lidhet me karten
protected int limit; //limiti i shpenzimit
protected double balance; // balanca e kartes qe perfaqeson detyrimin e klientit
/**
 * 
 * @param costumer emri i klientit psh(Agim Prifti)
 * @param bank emri i bankes psh Intensa San Barbara Unt
 * @param account numri i llogarise psh 5391 0375 9378 5309
 * @param limit limiti i kreditit ne euro psh 3000
 * @param balance balanca fillestare e matur ne euro
 */
public CreditCard(String costumer, String bank, String account, int limit, double balance) {
	super();
	this.costumer = costumer;
	this.bank = bank;
	this.account = account;
	this.limit = limit;
	this.balance = balance;
}
/**
 * konstruktori default
 */
public CreditCard() {
}
/**
 * 
 * @return konsumatori
 */
public String getCostumer() {return costumer;}
/**
 * 
 * @param costumer vendos emrin e konsumatorit
 */
public void setCostumer(String costumer) {this.costumer = costumer;}
/**
 * 
 * @return emri bankes
 */
public String getBank() {return bank;}
/**
 * 
 * @return vendos emrin e bankes
 */
public void setBank(String bank) {this.bank = bank;}
/**
 * 
 * @return llogaria
 */
public String getAccount() {return account;}
/**
 * 
 * @param account vendos nr e llogarise 
 */
public void setAccount(String account) {this.account = account;}
/**
 * 
 * @return limiti i kartes
 */
public int getLimit() {return limit;}
/**
 * 
 * @param limit vendos limitin e kartes
 */
public void setLimit(int limit) {this.limit = limit;}
/**
 * 
 * @return balanca aktuale
 */
public double getBalance() {return balance;}
/**
 * 
 * @param balance vendos balance 
 */
public void setBalance(double balance) {this.balance = balance;}

/**
 * metoda realizon blerjen me nje karte krediti.Blerja konsiderohet e suksesshme nese
 *  balanca + amount(shuma) nuk e kalon limitin
 *  @param amount shuma e blerjes
 *  @param true nese blerja realizohet dhe false nese nuk realizohet
 */
public boolean charge(double amount) {
	if(amount + this.getBalance() > this.getLimit())
		return false; //dalim nga metoda sepse blerja nuk realizohet
	
	setBalance(amount + this.getBalance());
	return true;
	
}
/**
 * metoda ben nje pagese te kartes dhe zvogelon detyrimin nga fusha balance
 * @param amount vlera e pageses se kartes
 */
public void makePayment(double amount) {
	if(amount> 0)
		setBalance(this.getBalance()-amount);
	
}

}

