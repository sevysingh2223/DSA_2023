package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {
    static void updateFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // writer.newLine();
            writer.write(content);
            System.out.println("File Updated Successfully");
        } catch (IOException e) {
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }

    static void readFile(String filePath1, String filePath2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath1))) {
            String line;
            System.out.println("FILE CONTENT IS");
            while ((line = reader.readLine()) != null) {
                // line = reader.readLine();
                updateFile(filePath2, line + "\n");
                // writer.newLine();
                // System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("E:\\DSA_23\\FileHandling\\T1.txt", "E:\\DSA_23\\FileHandling\\T2.txt");
    }
}
