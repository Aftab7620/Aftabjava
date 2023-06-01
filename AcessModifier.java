class Demo
{
    public String name;
    private int a=5;
    protected String s;
    
    void print()
    {
        System.out.println(a);
    }
   

}
class Demo2 extends Demo
{
    String name="Aftab";
    String s="khan";
    void show()
    {
        System.out.println(name +" " +s);
    }
    
}

public class AcessModifier {
    public static void main(String[] args) 
    {
        Demo2 obj=new Demo2();
        obj.show();
        obj.name="Aafuu";
        //obj.a=10;
        System.out.println(obj.name);
    }
    
}
