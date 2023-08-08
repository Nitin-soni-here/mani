class getset_privte{
    private String name;
    private long num;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }
}

public class get_set_private {
    public static void main(String[] args) {
    getset_privte obj=new getset_privte();
    obj.setName("pankaj");
        System.out.println(obj.getName());
  obj.setNum(773769123);
        System.out.println(obj.getNum());
    }
}
