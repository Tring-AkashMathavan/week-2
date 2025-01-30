package OOPS.Encapsulation;

public class Account {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Akash" , 892194832 , 100);
        user1.Maintain();

        BankAccount user2 = new BankAccount("ABC" , 830582522 , 400);
        user2.Maintain();

    }
}
