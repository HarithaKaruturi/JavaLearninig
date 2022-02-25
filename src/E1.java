import java.util.Scanner;

public class E1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter number1:");
        int num1=input.nextInt();

        if (num1 % 2 == 0) {
            System.out.print("number is even");

        }
        else{
            System.out.print("number is odd");

        }

    }
}
