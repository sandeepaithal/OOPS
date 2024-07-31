package runtimepolymorphism;

/**
 * A base class for sending messages.
 * Provides a generic method to send a message.
 * 
 * @author C Sandeep Aithal
 */
class Message {
    /**
     * Sends a generic message.
     */
    public void sendMsg() {
        System.out.println("Sending message");
    }
}

/**
 * Represents a message sent through SMS.
 * Overrides the sendMsg method to provide specific implementation.
 * 
 * @author C Sandeep Aithal
 */
class SMSMessage extends Message {
    @Override
    public void sendMsg() {
        System.out.println("Sending message through SMS");
    }
}

/**
 * Represents a message sent through Email.
 * Overrides the sendMsg method to provide specific implementation.
 * 
 * @author C Sandeep Aithal
 */
class Email extends Message {
    @Override
    public void sendMsg() {
        System.out.println("Sending message through Email");
    }
}

/**
 * A test class to demonstrate runtime polymorphism with message sending methods.
 * 
 * @author C Sandeep Aithal
 */
class Test1 {
    public static void main(String[] args) {
        Message m1 = new Message();
        Message m2 = new SMSMessage();
        Message m3 = new Email();
        
        m1.sendMsg();
        m2.sendMsg();
        m3.sendMsg();
    }
}
