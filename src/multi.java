/*class fun1 extends Thread{
    @Override
    public void run(){
        int i;
        for(i=0;i<100;i++){
            System.out.println("cool");
        }
    }
}
class fun2 extends Thread{
    @Override
    public void run(){
        int j;
        for(j=0;j<100;j++){
            System.out.println("not good");
        }
    }
}
*/
class fun3 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<1000;i++){
            System.out.println("copy");
        }
    }
}
class fun4 implements Runnable {
    @Override
    public void run() {
        int i;
        for (i = 0; i < 1000; i++) {
            System.out.println("paste");
        }
    }
}
public class multi {
    public static void main(String[] args) {
        // fun1 obj=new fun1();
        //fun2 obj1=new fun2();
        //obj.start();
        // obj1.start();
        fun3 obj2=new fun3();
        Thread T1=new Thread(obj2);
        T1.start();
        fun4 obj3=new fun4();
        Thread T2=new Thread(obj3);
        T2.start();
    }
}
