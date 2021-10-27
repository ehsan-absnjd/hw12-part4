public class Account {
    Bank bank;

    public Account(Bank bank) {
        this.bank = bank;
    }

    public long number;
    public long balance;
    public void deposit(){
        System.out.println("inside deposit");
    }
    public void withdraw(){
        System.out.println("inside withdraw");
    }
    void createTransaction(){
        System.out.println("inside create transaction");
    }
}
