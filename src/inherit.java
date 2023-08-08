class Animal{
    public void dog(){
        System.out.println("i m a dog");
    }
}
class monkey extends Animal  {

    public void dunk(){
        System.out.println("i m not a donkey");
    }
}

public class inherit {
    public static void main(String[] args) {
        monkey obj=new monkey();
        obj.dog();
        obj.dunk();
    }
}
