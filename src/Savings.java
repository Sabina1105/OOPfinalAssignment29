

public abstract class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxPin;

    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.setAccountNumber("2" + this.getAccountNumber());
        this.safetyDepositBoxID = (int)(Math.random() * 900.0D) + 100;
        this.safetyDepositBoxPin = (int)(Math.random() * 9000.0D) + 1000;
        this.setInterestRate();
    }

    public int getSafetyDepositBoxID() {
        return this.safetyDepositBoxID;
    }

    public void setSafetyDepositBoxID(int safetyDepositBoxID) {
        this.safetyDepositBoxID = safetyDepositBoxID;
    }

    public int getSafetyDepositBoxPin() {
        return this.safetyDepositBoxPin;
    }

    public void setSafetyDepositBoxPin(int safetyDepositBoxPin) {
        this.safetyDepositBoxPin = safetyDepositBoxPin;
    }

    public void setInterestRate(double baseInterestRate) {
        super.setInterestRate(this.getInterestRate() - 0.25D);
    }

    public String showInfo() {
        return super.showInfo() +
                "\nSAFETY DEPOSIT BOX ID: " + this.safetyDepositBoxID +
                "\nSAFETY DEPOSIT BOX PIN: " + this.safetyDepositBoxPin +
                "\nACCOUNT TYPE: SAVINGS \nINTEREST RATE: " + this.getInterestRate() + "\n";
    }
}