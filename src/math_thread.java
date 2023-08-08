class newth1 extends Thread {
    public void run() {
        int i = 0;
        while (i<400) {
            System.out.println("i am a infinite loop");
            i++;
           /* try {
                Thread.sleep(4555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
    }
}
class newth2 extends Thread{
    public void run(){
        for(int i=0;i<400;i++){
            System.out.println("i am not a infinite loop.... bcoz i am for loop");
        }
    }
}
public class math_thread {
    public static void main(String[] args) {
        newth1 t1=new newth1();
        t1.start();
        //t1.isAlive();
       /* try {
            t1.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }*/
       // newth2 t2=new newth2();
        //t2.start();
    }

}

