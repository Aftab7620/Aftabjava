class Car 
{  
    public void displayBrand()  
    {  
        System.out.println("Displaying Brand of A car");  
    }  
}  
interface Suzuki 
{  
    public void show();  
}  
interface Hyundai 
{  
    public void show();  
}   
public class HybridEx extends Car implements Suzuki, Hyundai  
{  
    public void show()  
    {  
    System.out.println("Implementation of show() method defined in interfaces Suzuki and Hyundai");  
    }    
    public void displayMsg()  
    {  
    System.out.println("Welcome to car world");  
    }   
public static void main(String args[])  
{  
    HybridEx obj = new HybridEx();  
    System.out.println(" Hybrid Inheritance in Java");  
    obj.show();  
    obj.displayMsg();  
}  
}  

