public class AccountsTest{
    public static void main(String[] args) {
        Accounts one = new Accounts();
        System.out.println("Your accountnumber is "+ one.getAccountNumber());
        one.setCheckingBalance(123456);
        one.setSavingsBalance(245676);
        System.out.println("Amount in checking account is $"+ one.getCheckingBalance());
        System.out.println("Amount in saving account is $" + one.getSavingsBalance());
        System.out.println("Total from both accounts is $"+ one.total());

    }
}

