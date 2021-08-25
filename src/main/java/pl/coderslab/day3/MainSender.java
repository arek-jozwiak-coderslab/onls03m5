package pl.coderslab.day3;

public class MainSender {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new SmsService());
        messageSender.sendMessage();

        MessageSender messageSenderEmail = new MessageSender(new EmailService());
        messageSenderEmail.sendMessage();
    }
}
