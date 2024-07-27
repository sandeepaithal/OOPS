package runtimepolymorphism;

class Message {
    public void sendMsg() {
        System.out.println("Sending message");
    }
}

class SMSMessage extends Message {
    @Override
    public void sendMsg() {
        System.out.println("Sending message through SMS");
    }
}

class Email extends Message {
    @Override
    public void sendMsg() {
        System.out.println("Sending message through Email");
    }
}

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
