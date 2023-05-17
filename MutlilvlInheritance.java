class Base
{
    void Display()
    {
        System.out.println("This is Method of Base class");
    }
}
class Derive extends Base
{
    void Display1()
    {
        System.out.println("This is method of Derived class");
    }
}
class Derive1 extends Derive
{
    void Display2()
    {
        System.out.println("This is Method of Derived class Which is Implementing Mutilevel Inheritance");
    }
}
class MutlilvlInheritance
{
    public static void main(String[] args)
    {
        Derive1 ob=new Derive1();
    ob.Display();
    ob.Display1();
    ob.Display2();
    System.out.println("This is a program to Illustrate the use of Multilevel inheritance");

    }
    
}
