class Animal
{
    Animal()
    {
        System.out.println("This is A default Constructor");
    }
}
class Dog extends Animal
{
    
    Dog(String name)
    {
        super();
        System.out.println("This is an Parameterized Constructor");
    }
}
class const1 
{
    public static void main(String[] args) 
    {
        Dog obj=new Dog("Hi");
        
        
    }
}
