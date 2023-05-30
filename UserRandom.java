import java.io.*;
import java.util.*;
public class UserRandom 
    //hello world 
{
    
    public static void main(String[] args)
    {
        int max = 100;
        int min = 0;
        System.out.println("Enter number of random numbers to generate:");
        Scanner count = new Scanner(System.in);
        Random rand = new Random();
        int counts = count.nextInt();
        int randomNum;

        try {
            FileWriter writer = new FileWriter("D:\\random.txt");
            for (int i = 0; i < counts; i++)
            {
                randomNum = rand.nextInt((max - min) + 1) + min;
                System.out.println(randomNum + " ");
                writer.write(Integer.toString(randomNum));
                writer.write(" ");
               
            }
            writer.close();
            System.out.println("Successfully wrote random numbers to file.");
        } catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        

        try {
            File file = new File("D:\\random.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}


        



