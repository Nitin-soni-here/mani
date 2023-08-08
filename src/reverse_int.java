public class reverse_int {
    public static void main(String[] args) {
        int rev=0;
        int num=123456789;
        for(int i=0;i<num;i++){
           int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            System.out.println(rev);
        }
    }
}