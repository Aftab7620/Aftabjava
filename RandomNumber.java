import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: numbers generated should be unique

class RandomNumber
{

    public static void main(String args[])
    {
        long start = System.currentTimeMillis();
        generateRandom(100000);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time taken : " +timeElapsed +" Milliseconds");
    }

    static void generateRandom(int limit)
    {
        if(limit<1) {
            System.out.println("Incorrect range given...");
            return;
        }
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<limit; i++) {
            int n = random.nextInt(limit) + 1;
            list.add(n);
        }
        writeFile(list,limit);
    }

    static void writeFile(List<Integer> list, int limit) {
        try {
            File file1 = new File("D:\\Num.txt");
            if(!file1.exists()) {
                if(file1.createNewFile())
                {
                    System.out.println("New File created successfully ");
                }
            }
            System.out.println("Writing data into file");
            FileWriter fw = new FileWriter(file1);
            BufferedWriter writer = new BufferedWriter(fw);
            for(int i=0; i<limit;i++) {
                writer.write( list.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e ) {
            System.out.println("Exception Caught : " + e);
        } finally {
            long start=System.currentTimeMillis();
            readFile(list,limit);
            long end=System.currentTimeMillis();
            long timeElapsed=end-start;
            System.out.println("Reading time takken :" +timeElapsed);
        }
    }

    static void readFile(List<Integer> list, int range) {
        try {
            File file1 = new File("D:\\Num.txt");
            if (!file1.exists()) {
                System.out.println("File does not exist...");
                System.exit(0);
            }
            FileReader fr = new FileReader(file1);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null && i < range) {
                int n = Integer.parseInt(line);
                System.out.println(i + ":" + n);
                i++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception Caught : " + e);
        }
    }
}

