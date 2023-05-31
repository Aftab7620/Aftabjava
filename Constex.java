public class Constex {  
        int id;  
        String name;  
        int age;  
        //creating two arg constructor  
        // creating constructor 
        Constex(int i,String n)
        {  
        id = i;  
        name = n;  
        }  
        //creating three arg constructor  
        Constex(int i,String n,int a){  
        id = i;  
        name = n;  
        age=a;  
        }  
        void display(){System.out.println(id+" "+name+" "+age);}  
       
        public static void main(String args[]){  
        Constex s1 = new Constex(111,"Karan");  
        Constex s2 = new Constex(222,"Aryan",25);  
        s1.display();  
        s2.display();  
       }  
    }  
    
