

public class E3 {
    public static void main(String[] args){

        System.out.printf("%s%10s%10s%n","number","squares","cubes");

        for (int i=0;i<=10;i++){
            double square=1*Math.pow(i,2);
            double cube=1*Math.pow(i,3);
            System.out.printf("%2d%10.2f%10.2f%n",i,square,cube);

        }
    }
}
