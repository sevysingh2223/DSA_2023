package FileHandling;

import java.io.File;

public class FileAccess {
    public static void main(String[] args) {
        File my_directory = new File("E:\\DSA_23\\Game");

        if (my_directory.isDirectory()) {
            File[] files_array = my_directory.listFiles();

            if (files_array != null) {
                System.out.println("Default Data");
                for (File each_file : files_array) {
                    System.out.println(each_file.getName());
                }
            }

            else {
                System.out.println("Empty Directory");
            }
        } else {
            System.out.println("The specified path is not a directory");
        }
    }
}


// CRUD
// Read (FIS)
// Write(FOS)
// Count Char
// Count line
// To Uppercase
// Make Dir and Dirs
// File Access : print no of files in a folder 
// Copy File Data
