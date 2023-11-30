public class SWM{
    public static void main(String[] args) {
        // int arr[] = {1,3,-1,-3,5,3,6,7};
        // int k = 3;
        int arr[] = {1};
        int k = 1;
        int ans[] = new int[arr.length - k +1];
        for(int i =0;i<=arr.length -k;i++){
            int max =arr[i];
            if(arr.length == 1){
                System.out.println(arr[0]);
                break;
            }
            for(int j=i+1 ; j<=i+k-1;j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            ans[i] = max;
        }

        for(int i: ans){
            System.out.print(i +" ");
        }
    }
}