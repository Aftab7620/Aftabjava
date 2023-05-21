class A
{
    void Sum()
    {
        int a=10;
        int b=2;
        int c=a+b;
        System.out.println("Addition is : " +c);
    }
}

class B
{
    void Sum(int n,int n1)
    {
        int a=n;
        int b=n1;
        int Res=n+n1;
        System.out.println(Res);
    }
}

public class funoverloading
{
    public static void main (String args[])
    {
        A ob=new A();
        ob.Sum();
        B ob1 = new B();
        ob1.Sum(10,22);
        
    }
    
}
