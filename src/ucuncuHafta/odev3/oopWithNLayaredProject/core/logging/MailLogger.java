package ucuncuHafta.odev3.oopWithNLayaredProject.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi: " + data);
    }
}
