package HashMapQues;

import java.util.HashMap;
import java.util.Map;

public class FindOccureences {
    static void findOcc(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> single_entry : map.entrySet()){
            System.out.println(single_entry.getKey() + " : " + single_entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{9,6,1,4,4,6,3,2,9};
        findOcc(nums);
    }
}
