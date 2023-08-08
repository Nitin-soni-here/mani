import java.util.Scanner;

class age extends Exception{
    @Override
    public String toString() {
        return  "Nhii tum chutiya bana rhe ho";
    }

    @Override
    public String getMessage() {
        return "haan ab aaya na line par";
    }
}

public class exception_class {
    public static void main(String[] args) {
        age obj1 = new age();

        System.out.println("enter age");

        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a <= 125) {
            System.out.println(obj1.getMessage());
        }
        else{
            System.out.println(obj1.toString());
            throw new ArithmeticException("exception Here");
        }
    }
}
