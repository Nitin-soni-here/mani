public class method {
    static int math(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }


    public static void main(String[] args) {
        int a=12;
        int b=33;
        int c=math(a,b);
       // method obj=new method();
       // int c=obj.math(a,b);
        System.out.println(c);
        int a1=22;
        int b1=53;
        int c1=math(a1,b1);
        //int c1= obj.math(a1,b1);
        System.out.println(c1);
    }
}