package org.example.training.exo3.solution;

public class Payment {
    private String cardNumber;
    private String cvv;
    private double amount;

    public Payment(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.cvv = builder.cvv;
        this.amount = builder.amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getCvv() {
        return cvv;
    }

    public double getAmount() {
        return amount;
    }

    public static class Builder {
        private String cardNumber;
        private String cvv;
        private double amount;

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder cvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
