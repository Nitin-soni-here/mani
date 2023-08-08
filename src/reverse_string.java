public class reverse_string {
    public static void main(String[] args) {
        String name="mumbai";
        /*we use to methods
        1. (.length)=for find the length of string
        2. (atchar)=at that position which element is present
         */
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
