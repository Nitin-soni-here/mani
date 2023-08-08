import javax.imageio.stream.ImageInputStream;

public class Practice_set {

    // print any table using method

/*    static void multi(int n) {
        for(int i=1;i<10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        multi(10);
    }*/

   public static void main(String[] args) {
       for (int i=0;i<9;i++){
           for(int j=9;j>i;j--){
               System.out.print("*");
           }
           System.out.println();
       }
   }

}
