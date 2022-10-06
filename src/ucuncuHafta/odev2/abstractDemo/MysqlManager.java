package ucuncuHafta.odev2.abstractDemo;

public class MysqlManager extends DatabaseManager{
    @Override
    public void getData() {
        System.out.println("veri getirildi: Mysql");
    }
}
