

    public interface BaseInterestRate {
        double BASE_INTEREST_RATE = 2.5D;

        default double getBaseInterestRate() {
            return 2.5D;
        }

        void setInterestRate();
    }


