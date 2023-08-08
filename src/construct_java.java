class construct{
    public construct(String nam, int id){
        name=nam;
        num=id;

    }
    private String name;
    private int num;
    public String getName(){
        return name;
    }
     public int getNum() {
        return num;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class construct_java {
    public static void main(String[] args) {
        construct obj=new construct("pankaj",45);
        System.out.println(obj.getName());
        System.out.println(obj.getNum());
    }
}
