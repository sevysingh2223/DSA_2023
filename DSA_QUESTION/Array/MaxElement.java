package DSA_QUESTION.Array;

public class MaxElement {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3,4},{5,6,7,8, 51 ,6},{9,10,11,12}};
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // System.out.print(arr[i][j] + " ");
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }

        // System.out.println("Number of rows :"  + arr.length);
        // System.out.println(arr[0].length);
        // System.out.println(arr[1].length);
        // System.out.println(arr[2].length);

        System.out.println("MAX ELEMENT IS : " + max);
    }
}
