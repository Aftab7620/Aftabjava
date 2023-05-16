class SuperDemo
{
    int x=19;
   
    void Show()
    {
        System.out.println("This is Base Class Function");
        x=10;
        System.out.println(x);
    }
}
class Derivedemo extends SuperDemo
{ 
    int y=10;
    int  c=x+y;
    void display()
    {
        System.out.println("This is Derived Class Function");
    }
}


class SimpleInheritance
{
    public static void main(String[] args)
    {
        Derivedemo d=new Derivedemo();
        d.Show();
        d.display();
        System.out.println(d.c);
    }
    
}
