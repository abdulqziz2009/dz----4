

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000);

        try {
            while (true) {
                account.withDraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Вы можете снять только " + e.getRemainingAmount() + " сомов.");
        }
    }
}