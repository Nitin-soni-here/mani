
class coustem{
    int user_id;
    String name;
    int salary;
  public void employer(){
        System.out.println(user_id);
        System.out.println(name);
    }
    public void get_salary(){
        System.out.println(salary);
    }

}

 public class coustem_class {
     public static void main(String[] args) {
         coustem obj=new coustem();
         obj.user_id=12;
         obj.name="nitin soni";
         obj.salary=35000;
         obj.employer();
         obj.get_salary();
     }
}
