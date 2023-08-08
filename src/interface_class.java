interface math{
    public void cycle(int lessspeed);
    public void bike(int highspeed);
}
class math2 implements math{
    public void nitu() {
        System.out.println("hello baby");
    }
        public void cycle(int lessspeed){
            System.out.println("i m interface method with less speed");
        }
    public void bike(int highspeed){
        System.out.println("i m interface method with high speed");
    }

}

public class interface_class {
    public static void main(String[] args) {
        math2 obj=new math2();
        obj.nitu();
        obj.cycle(21);
    }
}
