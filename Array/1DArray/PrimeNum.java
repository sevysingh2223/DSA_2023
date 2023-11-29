public class PrimeNum {

    static boolean isPrime(int element){
        for(int i=2;i<element-1;i++){
            if(element % i==0){
                // no more prime
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {8,6,5,12,7,89,34};
        for (int element : arr) {
            if(isPrime(element)){
                System.out.println("PRIME ELEMENT : " + element);
            }
        }
    }
}
