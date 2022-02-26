import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Account acc1=new Account("Jane",50.00);
        Account acc2=new Account("John",20.00);
        System.out.println("Initial account1 details:");
        System.out.printf("%s account has %.2f balance%n",acc1.getName(),acc1.getBalance());
        System.out.println("Initial account2 details:");
        System.out.printf("%s account has %.2f balance%n",acc2.getName(),acc2.getBalance());
        double withdrawamount=input.nextDouble();
        acc2.withDraw(withdrawamount);
        System.out.printf("%s account has %.2f balance%n",acc1.getName(),acc1.getBalance());
        System.out.printf("%s account has %.2f balance%n",acc2.getName(),acc2.getBalance());





    }
}
