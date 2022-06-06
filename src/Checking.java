
public class Checking extends Account {
    private String debitCardNo;
    private int debitCardPIN;

    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.setAccountNumber(1 + super.getAccountNumber());
        this.debitCardNo = this.generateDebitCardNo();
        this.debitCardPIN = (int)(Math.random() * 9000.0D) + 999;
        this.setInterestRate();
    }

    public int getDebitCardPIN() {
        return this.debitCardPIN;
    }

    public void setDebitCardPIN(int debitCardPIN) {
        this.debitCardPIN = debitCardPIN;
    }

    public void setInterestRate() {
        double interestRate = super.getInterestRate() * 15.0D / 100.0D;
    }

    public String generateDebitCardNo() {
        long d = (long)(Math.random() * 1.00000000000001E14D);
        this.debitCardNo = ("9" + d).toString();
        return this.debitCardNo;
    }

    public String showInfo() {
        return super.showInfo() + "\nACCOUNT TYPE: CHECKING\nDEBIT CARD NO: " + this.generateDebitCardNo() + "\nDEBIT CARD PIN: " + this.debitCardPIN + "\nINTEREST RATE : " + this.getInterestRate() + "\n";
    }
}