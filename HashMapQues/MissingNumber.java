package HashMapQues;

import java.util.HashMap;

public class MissingNumber {
    static int findNum(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{9,6,1,2,3,8,5,7,10};
        System.out.println(findNum(nums));
    }
}
