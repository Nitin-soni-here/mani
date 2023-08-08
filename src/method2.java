public class method2 {
    static void math() {
        System.out.println("good morning bro");}

    // ...arr variable arrgument
        static void math(String x, int ...arr) {
            System.out.println("good morning" +" " +x);
            for(int a:arr){
                System.out.println(a);
            }
        }
    static void math(int x,int y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        math();
        math("brother",33,54,87);
        math(32,55);
    }
}