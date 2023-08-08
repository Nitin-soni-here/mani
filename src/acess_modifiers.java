class nitu{
    public int x=10;
    protected int y=22;
    int z=33;
    private int u=99;


    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);

    }
}
public class acess_modifiers {
    public static void main(String[] args) {
        nitu obj=new nitu();
      //  obj.math1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
       // System.out.println(obj.U());

    }
}
