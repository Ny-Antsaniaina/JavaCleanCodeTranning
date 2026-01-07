package org.example.training.exo5.solution;

public class Notification {
    private final TypeNotification type;
    private final String message;

    public Notification(Builder builder) {
        this.type = builder.type;
        this.message = builder.message;
    }

    public TypeNotification getType() {
        return type;
    }
    public String getMessage() {
        return message;
    }

    public static class Builder{
        private TypeNotification type;
        private String message;

        public Builder type(TypeNotification type) {
            this.type = type;
            return this;
        }

        public Builder message(String message){
            this.message = message;
            return this;
        }

        public Notification build(){
            return new Notification(this);
        }
    }
}
