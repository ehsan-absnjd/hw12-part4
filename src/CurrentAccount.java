public class CurrentAccount extends Account{
    SavingAccount savingAccount;
    public long accountNo;
    public long balance;

    public CurrentAccount(Bank bank) {
        super(bank);
    }

    @Override
    public void withdraw(){
        System.out.println("inside overriden withdraw");
    }
}
