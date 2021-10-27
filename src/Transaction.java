import java.util.Date;

public class Transaction {
    Account account;
    public long transactionId;
    public Date date;
    public String type;
    public long amount;
    public long postBalance;
    public void modifies(){
        System.out.println("inside modifies");
    }
}
