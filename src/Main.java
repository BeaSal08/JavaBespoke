import com.test.app.*;

public class Main {
    public static void main(String[] args) {
        // Arrays
        // 1D
        String branchNames[] = {"Manila", "Paris", "Mumbai"};
        System.out.println("1st branch, index 0: " + branchNames[0]);
        System.out.println("Array length: " + branchNames.length);

        // Multi-D, array of arrays
        int marks[][] = {
                {77, 85, 68, 99, 87},
                {98, 56, 79, 90, 92},
                {78, 88, 56, 70, 99}
        };
        System.out.println("marks[1][2]: " + marks[1][2]); //gets 2nd row, 3rd col = 79
        System.out.println("Array length: " + marks.length);

        int result[][] = new int[3][5];
        System.out.println("Array length: " + result.length);

    }
}