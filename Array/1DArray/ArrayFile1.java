import java.util.Arrays;
import java.util.Scanner;

public class ArrayFile1{
    public static void main(String[] args) {
        // int age[] = {10,20,30,50,40,50,60,85};
        // System.out.println("Classname@hashcode: " + age);
        // System.out.println("Size of an array " + age.length);

        // How to print elements of an array
        // for(int i=0;i<age.length;i++){
        //     System.out.print(age[i] + "  ");
        // }
        // System.out.println("=====================================");
        // enhance for loop
        // for(int item:age){
        //     System.out.print(item +"  ");
        // }


        //Take input of elements in an array
        // System.out.println("Please enter the size of array");
        Scanner scanner = new Scanner(System.in);
        // int size = scanner.nextInt();

        // int number[] = new int[size];
        // System.out.println("Enter elements");
        // for(int i=0;i<size;i++){
        //     number[i] = scanner.nextInt();
        // }

        // method 2 avaialble for array : Arrays.sort(number)
        // Arrays.sort(number);

        // System.out.println("The inserted elements are");
        // for(int i : number){
        //     System.out.print(i + " ");
        // }

        System.out.println("Enter the dimensions of 2d array");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int array[][] = new int[rows][cols];
        
        System.out.println("Enter elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Inserted elements are");
        for(int row[] :array){
            for(int element : row){
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }
}
