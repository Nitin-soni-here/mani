import java.util.Scanner;

class bank {
    private int passward;
    private int balance=10000;
    int money;
    Scanner obj = new Scanner(System.in);

    public void deposit() throws Exception {
        System.out.println("Enter passward");
            int passward = obj.nextInt();

            if (passward == 7737) {
                System.out.println("How much money you want to deposit");
                money = obj.nextInt();
                int b = money + balance;
                System.out.println("Your money has been deposit");
                System.out.println("Total balance" + " " + b);
            } else {
                System.out.println("Incorrect passward");
            }
        }
    public void withdrawal() throws Exception{
        System.out.println("Enter passward");
        int passward = obj.nextInt();
        if (passward == 7737) {
            System.out.println("How much money you want to withdraw");
            money = obj.nextInt();
            if(balance<money){
                System.out.println("Insufficient balance");
            }
           else if(balance==0 || balance!=0) {
           int c = balance-money;
            System.out.println("Your total balance is" + " "+c);}
        }
         else {
            System.out.println("Incorrect passward");
         }
    }
    public void Check_Balance()throws Exception{
        System.out.println("Enter passward");
        int passward = obj.nextInt();
        if (passward == 7737){
            System.out.println(balance);
        }else {
            System.out.println("Incorrect passward");
        }
    }
}
public class bank_prblm {
    public static void main(String[] args) {
        bank b=new bank();
        System.out.println("What you want to do");
        System.out.println("1. deposit Balance");
        System.out.println("2. withdrawal Balance");
        System.out.println("3. Check Balance");
        Scanner obj1=new Scanner(System.in);
       try{
           int ch=obj1.nextInt();
           switch (ch){
               case 1 :b.deposit();
                   break;
               case 2 :b.withdrawal();
                   break;
               case 3 :b.Check_Balance();
                   break;
               case 4 : System.out.println("incorrect choice");}
       }
       catch(Exception e){
           System.out.println("Invalid Enter");
       }
    }
}
