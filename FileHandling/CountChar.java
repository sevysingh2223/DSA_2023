package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountChar {
    public static void main(String[] args) {
        String inputFilePath = "E:\\DSA_23\\FileHandling\\output.txt";
        try {
            FileReader fileReader = new FileReader(inputFilePath);

            int data;
            int count =0;
            while ((data = fileReader.read()) != -1) {
                count++;
            }
            System.out.println("Character count is : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
