package Recursion;

public class BinaryToDecimal {

    static int toDec(String number , int index,int length, int result){
        if(index == length){
            return result;
        }
        int digit = Character.getNumericValue(number.charAt(index));
        result += digit * Math.pow(2 , length - index-1);
        return toDec(number, index+1,length, result);
    }
    public static void main(String[] args) {
        String num = "10000";
        int length = num.length();
        int ans = toDec(num, 0,length,  0);
        System.out.println(ans);
    }
}
