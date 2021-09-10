public class BankAcctTest {
    public static void main(String[] args) {
    BankAcct firstAcct= new BankAcct(100.15, 99.85);
    firstAcct.deposit(100);
    firstAcct.withdraw(50);
    firstAcct.checkBalances();
    }
}
