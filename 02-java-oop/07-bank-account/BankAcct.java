public class BankAcct {
    private double checkBalance;
    private double savBalance;
    private static int numOfAccts;
    private static double allMoney;

    public BankAcct(double checkBalance, double savBalance) {
    this.checkBalance= checkBalance;
    this.savBalance= savBalance;
    numOfAccts++;
    allMoney = allMoney +this.checkBalance + this.savBalance;
    }
    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }
    public void setSavBalance(double savBalance) {
        this.savBalance = savBalance;
    }
    public void setAllMoney(double allMoney) {
        BankAcct.allMoney = allMoney;
    }
    public double getCheckBalance() {
        return checkBalance;
    }
    public double getSavBalance() {
        return savBalance;
    }
    public double deposit(int deposit) {
        getCheckBalance();
        checkBalance= this.checkBalance += deposit;
        setCheckBalance(checkBalance);
        System.out.println("Your new checking balance is:" + checkBalance);
        return checkBalance;
    }
    public double withdraw(int withdrawal) {
        getCheckBalance();
        checkBalance = this.checkBalance -= withdrawal;
        if(checkBalance <= 0) {
            System.out.println("Sorry, you do not have the requisite funds");
            System.exit(1);
        } else {
            System.out.println("Your new balance is:" + checkBalance);
            return checkBalance;
        }
        return checkBalance;
    }
    public void checkBalances() {
        getCheckBalance();
        getSavBalance();
        System.out.println("Your checking account balance is:" + checkBalance);
        System.out.println("Your savings account balance is:" + savBalance);
    }
}
