

    import java.util.Random;

    public abstract class Account implements BaseInterestRate {
        private String name;
        private String ssn;
        private double balance;
        private String accountNumber;
        private String routingNumber;
        private double interestRate;

        public Account(String name, String ssn, double balance) {
            this.name = name;
            this.ssn = ssn;
            this.balance = balance;
            this.accountNumber = this.generateAccountNumber(ssn);
            this.routingNumber = this.generateRoutingNumber();
            this.interestRate = this.getBaseInterestRate();
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSsn() {
            return this.ssn;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public double getBalance() {
            return this.balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getRoutingNumber() {
            return this.routingNumber;
        }

        public void setRoutingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
        }

        public double getInterestRate() {
            return this.interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public String generateAccountNumber(String ssn) {
            new Random();
            String lastFour = ssn.substring(ssn.length() - 4);
            return lastFour + 9999999 + (int)(Math.random() * 1.0E7D);
        }

        public String generateRoutingNumber() {
            int randomRouting = 9999999 + (int)(Math.random() * 1.0E7D);
            return "00" + randomRouting;
        }

        public void deposit(double amount) {
            double newBalance = amount + this.balance;
            System.out.println(newBalance);
        }

        public void withdraw(double amount) {
            if (amount <= this.balance) {
                double var10000 = this.balance - amount;
                System.out.println("NewBalance");
            } else {
                System.out.println("Error message");
            }

        }

        public String showInfo() {
            return "Account{\nNAME: " + this.name + '\'' + "\n,SSN:" + this.ssn + "\n, ACCOUNT NUMBER:" + this.accountNumber + "\n, ROUTING NUMBER: " + this.routingNumber + "\n, BALANCE: " + this.balance + '}';
        }
    }


