class t1 implements Runnable{
    public t1(String name){
         super();
    }

    public void run(){
        int i;
        for(i=0;i<1000;i++){
            System.out.println("copy");
        }
        }
    }

public class constructor_multi {
    public static void main(String[] args) {
        t1 obj=new t1("nitu");
        Thread obj1=new Thread(obj);
        //obj1.start();
        System.out.println(obj1.getName());
    }
}
