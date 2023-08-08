class p1 extends Thread {
    public void run() {
        int i = 0;
        while (i<400) {
            System.out.println("toba ye mastni chal");
            i++;
        }
    }
}
   class p2 extends Thread{
        public void run(){
            for(int i=0;i<400;i++){
                System.out.println("chke he jana hai");
            }
        }
    }
public class nitu_pri {
    public static void main(String[] args) {
        p1 obj=new p1();
        p2 obj2=new p2();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj2.start();
        obj.start();
    }
}

