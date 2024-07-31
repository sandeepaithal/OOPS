package runtimepolymorphism;

/**
 * A base class for making payments.
 * Provides a generic method to make a payment.
 * 
 * @author C Sandeep Aithal
 */
class MakePayment {
    /**
     * Makes a generic payment.
     */
    public void makePayment() {
        System.out.println("Making a generic payment");
    }
}

/**
 * Represents a payment made through a credit card.
 * Overrides the makePayment method to provide specific implementation.
 * 
 * @author C Sandeep Aithal
 */
class CreditCard extends MakePayment {
    @Override
    public void makePayment() {
        System.out.println("Making payment through credit card");
    }
}

/**
 * Represents a payment made through PhonePe.
 * Overrides the makePayment method to provide specific implementation.
 * 
 * @author C Sandeep Aithal
 */
class PhonePe extends MakePayment {
    @Override
    public void makePayment() {
        System.out.println("Making payment through PhonePe");
    }
}

/**
 * A test class to demonstrate runtime polymorphism with payment methods.
 * 
 * @author C Sandeep Aithal
 */
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
