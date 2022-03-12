
public class InvoiceTest {
    public static void main(String[] args){
        Invoice p1=new Invoice("10ER","MOBILE",5,30);
        Invoice p2=new Invoice("28FW","XYZ",-4,300);
        Invoice p3=new Invoice("17QH","Land",10,-4000);

        System.out.println("product details:");
        System.out.printf("%s details are num:%s ,quan:%d ,price:%f %n",p1.getDes(),p1.getNum(),p1.getQuan(),p1.getPrice());
        System.out.printf("%s details are num:%s ,quan:%d ,price:%f %n",p2.getDes(),p2.getNum(),p2.getQuan(),p2.getPrice());
        System.out.printf("%s details are num:%s ,quan:%d ,price:%f %n",p3.getDes(),p3.getNum(),p3.getQuan(),p3.getPrice());

        System.out.println("Invoice of products:");
        System.out.printf("p1 invoice amount is: %f %n",p1.getInvoiceAmount());
        System.out.printf("p2 invoice amount is: %f %n",p2.getInvoiceAmount());
        System.out.printf("p3 invoice amount is: %f %n",p3.getInvoiceAmount());

    }
}
