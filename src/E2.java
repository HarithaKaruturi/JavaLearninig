import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five digit num");
        int num = input.nextInt();
        int divider = 10000;
        int mod = num%divider;
        System.out.print((num / divider) + " ");

        for(int i=1;i<=4;i++) {
            divider = divider / 10;
            System.out.print((mod / divider) + " ");
            mod = mod % divider;
        }


    }
}
