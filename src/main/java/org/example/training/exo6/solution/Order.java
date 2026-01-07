package org.example.training.exo6.solution;

public class Order {
    private PaymentType paymentType;
    private double amount;

    public Order(Builder builder){
        this.paymentType = builder.payment;
        this.amount = builder.amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
    public double getAmount() {
        return amount;
    }
    public static class Builder{
        private PaymentType payment;
        private double amount;

        public Builder payment(PaymentType payment){
            this.payment = payment;
            return this;
        }
        public Builder amount(double amount){
            this.amount = amount;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
