// program for hierarchical inheritance
class Base
{
    int original=10;
}

class Child1 extends Base
{
    int child1=1;
}
class Child2 extends Base
{
    int child2=2;
}
class Child3 extends Base
{
    int child3=3;
}
public class Hierarchical
{
    public static void main(String[] args)
    {
        Child1 obj=new Child1();
        Child2 obj1=new Child2();
        Child3 obj3=new Child3();
        System.out.println("Original*child1 " +obj.original*obj.child1); 
        System.out.println("Original*child2 " +obj1.original*obj1.child2); 
        System.out.println("Original*child3 " +obj3.original*obj3.child3); 
    }
   
}
