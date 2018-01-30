import java.util.Random;

public class Accounts{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmountInAccount;

public Accounts(){
    generateNewAccountNumber();
}

public String getAccountNumber(){
    return accountNumber;
}

private String generateNewAccountNumber(){
    String numbers = "0123456789";
    String newAccountNumber = "";

    Random rand = new Random();

    for (int i = 0; i < 5; i ++){
        int num = numbers.charAt(rand.nextInt(10));
        newAccountNumber += num;
    }

    accountNumber = newAccountNumber;

    return newAccountNumber;
}

public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
}

public double getCheckingBalance(){
    return this.checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
}

public double getSavingsBalance(){
    return this.savingsBalance;
}

public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmountInAccount += checkingBalance;
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    totalAmountInAccount += savingsBalance;
}
public static int getNumberOfAccounts() {
	return numberOfAccounts;
}

public static void setNumberOfAccounts(int numberOfAccounts) {
	Accounts.numberOfAccounts = numberOfAccounts;
}

public double total() {
    totalAmountInAccount = savingsBalance + checkingBalance;
    return totalAmountInAccount;
}

public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("insufficient funds in checking account");
    }
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));

    }
}

public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("insufficient funds saving account");
    }
    else{
        setSavingsBalance(getSavingsBalance() - Double.valueOf(amount));

    }
}
// public void info(){
//     System.out.println("Your account lnumber is " + getAccountNumber());
//     System.out.println("Amount in checking account is $"+ getCheckingBalance());
//     System.out.println("Amount in savings account is $" + getSavingsBalance());
//     System.out.println("Amount in all accounts is $" + total());
//     System.out.println("You have " + getNumberOfAccounts() + " accounts");
// }



}
