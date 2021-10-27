import java.util.Date;

public class Customer {
    CurrentAccount currentAccount;
    SavingAccount savingAccount;
    public String name;
    public String address;
    public Date dob;
    public long cardNumber;
    public long pin;
    public void verifyPassword(){
        System.out.println("inside verify password");
    }

}
