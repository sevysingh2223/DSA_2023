package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ToUppercase {
    public static void main(String[] args) {
        String inputFilePath = "E:\\DSA_23\\FileHandling\\intro.txt";
        String outputFilePath = "E:\\DSA_23\\FileHandling\\output.txt";

        try {
            FileReader fileReader = new FileReader(inputFilePath);
            StringBuilder content = new StringBuilder();

            int data;
            while ((data = fileReader.read()) != -1) {
                content.append((char) data);
            }
            fileReader.close();

            String capitalContent = content.toString().toLowerCase();

            FileWriter fileWriter = new FileWriter(outputFilePath);
            fileWriter.write(capitalContent);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
