import java.io.File;

public class MakeDirectory {
    public static void main(String[] args) {
        File directory1 = new File("grandParent");
        boolean madeDir1 = directory1.mkdir();
        System.out.println("Directory Created Successfully" + madeDir1);


        File directory2 = new File("grandParent/parentDir/childDir1");
        File directory3 = new File("grandParent/parentDir/childDir2");

        boolean madeDir2 = directory2.mkdirs();
        boolean madeDir3 = directory3.mkdirs();
        System.out.println("Directory Created Successfully" + madeDir2);
        System.out.println("Directory Created Successfully" + madeDir3);
    }
}
