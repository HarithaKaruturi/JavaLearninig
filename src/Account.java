public class Account {
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name=name;
        if(balance>0){
            this.balance=balance;
        }
        else{
            System.out.print("Balance is negative%n");
        }
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void withDraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.print("withdrawal amount exceeded account balance");
        }
    }

    public double getBalance(){
        return balance;
    }

}
