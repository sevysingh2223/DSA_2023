package String;

public class InbuiltMethodsOfString {
    public static void main(String[] args) {
        String str = "Hello By_Me";
        // System.out.println("Length is " + str.length());

        // System.out.println("Char At index : 0 " + str.charAt(0));
        // System.out.println("Char At index : 4 " + str.charAt(4));
        // System.out.println("Char At index : 9 " + str.charAt(9));
        // System.out.println("Char At index : 12 " + str.charAt(12));

        // Substring
        // System.out.println(str.substring(3));
        // System.out.println(str.substring(2,9));

        // concat
        System.out.println(str.concat(" : BMPL"));

        // indexOf
        System.out.println(str.indexOf("M"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.indexOf("Me"));

        // firstindexof
        System.out.println(str.lastIndexOf("l"));

        // contains
        System.out.println(str.contains("llw"));
    }
}
