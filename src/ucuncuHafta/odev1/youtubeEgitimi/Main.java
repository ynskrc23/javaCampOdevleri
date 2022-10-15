package ucuncuHafta.odev1.youtubeEgitimi;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();
    }
}

class CreditManager
{
    public void calculate() {
        System.out.println("Hesaplandı...");
    }

    public void save() {
        System.out.println("Kredi Verildi...");
    }
}

interface ICreditManager{
    void calculate();
    void save();
}


abstract class BaseCreditManager implements ICreditManager {
    public abstract void calculate();

    public void save() {
        System.out.println("Kaydedildi...");
    }
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı...");
    }
}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Asker Kredisi Hesaplandı...");
    }
}


class CarCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Araç Kredisi Hesaplandı...");
    }
}

class Customer {
    public Customer() {
        System.out.println("Müşteri Nesnesi Başlatıldı.");
    }
    public int id;
    public String City;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
}


class Company extends Customer {
    public String CompanyName;
    public String TaxNumber;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }
}


class Person extends Customer {
    public String nationalIdentity;
    public String firstName;
    public String lastName;

    public String getNationalIdentity() {
        return nationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity) {
        nationalIdentity = nationalIdentity;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        lastName = lastName;
    }
}


class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer , ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save() {
        System.out.println("Müşteri Kaydedildi... " );
    }

    public void Delete() {
        System.out.println("Müşteri Silindi... " );
    }
    public void giveCredit() {
        _creditManager.calculate();
        System.out.println("Kredi Verildi...");
        _creditManager.save();
    }
}