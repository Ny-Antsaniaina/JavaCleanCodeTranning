package org.example.training.exo2.solution;

public class Order {
    private String productName;
    private int quantity;
    private double price;
    private String userType;

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getUserType() {
        return userType;
    }

    public Order(Builder builder) {
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.userType = builder.userType;
    }

    public static class Builder {
        private String productName;
        private int quantity;
        private double price;
        private String userType;

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }
        public Order build() {
            return new Order(this);
        }
    }
}
