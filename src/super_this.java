class parent{
    public int a;


    parent(int x){
       this.a=x;

    }
}
public class super_this {
    public static void main(String[] args) {
        parent obj=new parent(33);
        System.out.println(obj.a);

    }
}
