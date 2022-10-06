package ucuncuHafta.odev2.abstractDemo;

public class PostgreSqlManager extends DatabaseManager{
    @Override
    public void getData() {
        System.out.println("veri getirildi: PostgreSql");
    }
}
