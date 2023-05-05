import java.io.*;
import java.util.*;

public class UniqueRandom 
{
    public static void main(String[] args) 
    {
        int max = 400000;
        int min = 0;
        System.out.println("Enter number of unique random numbers to generate:");
        Scanner count = new Scanner(System.in);
        Random rand = new Random();
        int counts = count.nextInt();
        int randomNum;

        HashSet<Integer> set = new HashSet<>();
        try {
            FileWriter writer = new FileWriter("D:\\uniq.txt");
            while (set.size() < counts) {
                randomNum = rand.nextInt((max - min) + 1) + min;
                if (!set.contains(randomNum)) {
                    set.add(randomNum);
                    System.out.println(randomNum + " ");
                    writer.write(Integer.toString(randomNum));
                    writer.write(" ");
                }
            }
            writer.close();
            System.out.println("Successfully wrote random numbers to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try {
            File file = new File("D:\\uniq.txt");
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
