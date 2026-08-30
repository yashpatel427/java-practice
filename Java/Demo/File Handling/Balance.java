
public class Balance {

    public static void main(String[] args) {

        try {
            double balance = 5000;
            double withdraw = 7000;

            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }
            System.out.println("Withdrawal successful.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Transaction complete.");
        }
    }
}
