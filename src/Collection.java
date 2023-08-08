import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(11);
        obj.add(15);
        obj.add(14);
        obj.add(18);
        obj.add(13);
        obj.add(19);
        obj.add(12);
        obj.add(11);
        obj.add(20);
        //System.out.println();
        System.out.println(obj);
        LinkedList obj1=new LinkedList();
        obj1.add(11);
        obj1.add("chinu");
        obj1.add(18);
        obj1.add("manish");
        obj1.add("yogita");
        obj1.add("varsha");
        obj1.add("nitin");
        System.out.println(obj1);
obj1.retainAll(obj);
        System.out.println(obj);
        System.out.println(obj1);
    }
}
