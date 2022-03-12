
public class Invoice {
    private String num;
    private String des;
    private int quan;
    private double price;

    public Invoice(String num,String des,int quan,double price){
        this.num=num;
        this.des=des;
        this.quan=quan;
        this.price=price;
    }

    public void setNum(String num){
        this.num=num;
    }
    public String getNum(){
        return num;
    }

    public void setDes(String des){
        this.des=des;
    }
    public String getDes(){
        return des;
    }

    public void setQuan(int quan){
        this.quan=quan;
    }
    public int getQuan(){
        return quan;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    public double getInvoiceAmount(){
        if (quan < 0) {
            quan=0;
        }
        if(price<0){
            price=0;
        }
        double amount=quan*price;
        return amount;
    }

}
