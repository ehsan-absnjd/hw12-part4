public class SavingAccount extends Account{
    CurrentAccount currentAccount;
    public long accountNo;
    public long balance;

    public SavingAccount(Bank bank) {
        super(bank);
    }
}
