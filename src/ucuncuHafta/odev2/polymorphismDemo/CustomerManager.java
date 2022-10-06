package ucuncuHafta.odev2.polymorphismDemo;

public class CustomerManager {
    private  BaseLogger baseLogger;

    CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        baseLogger.log("log mesajı");
    }
}
