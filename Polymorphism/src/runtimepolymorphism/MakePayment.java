package runtimepolymorphism;

class MakePayment {
    public void makePayment() {
        System.out.println("Making a generic payment");
    }
}

class CreditCard extends MakePayment {
    @Override
    public void makePayment() {
        System.out.println("Making payment through credit card");
    }
}

class PhonePe extends MakePayment {
    @Override
    public void makePayment() {
        System.out.println("Making payment through PhonePe");
    }
}

class Test {
    public static void main(String[] args) {
        // Generic payment
        MakePayment p1 = new MakePayment();
        // Credit card payment
        MakePayment p2 = new CreditCard();
        // PhonePe payment
        MakePayment p3 = new PhonePe();
        
        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}
