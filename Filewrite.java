
import java.io.FileWriter;
import java.io.IOException;

// Main class
public class Filewrite{
//Program for file handling in java
   
    public static void main(String[] args)
    {

        // Content to be assigned to a file
        // Custom input just for illustration purposes
        String text= "Hello Duniya";

        // Try block to check if exception occurs
        try {

            
            FileWriter fWriter = new FileWriter("demo.docx");

            
            fWriter.write(text);

            // Printing the contents of a file
            System.out.println(text);

            // Closing the file writing connection
            fWriter.close();

            // Display message for successful execution of
            // program on the console
            System.out.println("File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}