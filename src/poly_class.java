import org.w3c.dom.ls.LSOutput;

class pl1{
   void ni1(){

        System.out.println("heelo world");
    }
    void nt(){
        System.out.println("hello chutiye");
    }
}
class pl2 extends pl1{
    @Override
    void ni1(){
        super.ni1();
        System.out.println("ok");
    }
}
class pl3 extends pl2{
    void ni3(){
        super.ni1();
        System.out.println("ja be");
    }
}
public class poly_class {
    public static void main(String[] args) {
        pl2 obj= new pl3();
        obj.ni1();

    }
}
