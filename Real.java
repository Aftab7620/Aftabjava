class Car
{
    String Color;
    int Model;
    String Company()
    {
        return "This is a car Manufactured By Company";
        
        
    }
   
}
class Suzuki extends Car
{
    
    void Company(String Name)
    {
        System.out.println("This car is manufactured by suzuki");
    }
}
public class Real 
{
   public static void main(String[] args) {
    Suzuki obj=new Suzuki();
    obj.Color="Red";
    System.out.println("The color of car is :" +obj.Color);
    obj.Model=123;
    System.out.println("Model no of car is :" +obj.Model);
    obj.Company("Suzuki");
    obj.Company();
   } 
}
