package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// CRUD
// C - CREATE
// R - READ
// U - UPDATE
// D - DELETE
public class CRUDFile {

    static void createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File Created Successfully : " + file.getName());
            } else {
                System.out.println("File Already Exist");
            }
        } catch (IOException e) {
            System.out.println("An error Occured");
            e.printStackTrace();
        }

    }

    static void deleteFile(String path){
        File file = new File(path);
        if(file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Some error occured");
        }
    }

    static void readFile(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("FILE CONTENT IS");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }

    static void updateFile(String filePath , String content){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath , true))){
            writer.newLine();
            writer.write(content);
            System.out.println("File Updated Successfully");
        }
        catch(IOException e){
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "E:\\DSA_23\\OOPS\\RANDOM";

        // Create
        createFile(filePath);
        
        String content = "Print 1 to N";
        updateFile(filePath, content);

        readFile(filePath);
        deleteFile(filePath);
    }
}
