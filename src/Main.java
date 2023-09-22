import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;

        System.out.println(Arrays.deepToString(mat)+"\n");


        String[] strs = new String[] {"practice.geeksforgeeks.org",
                "www.geeksforgeeks.org"
        };
        System.out.println(Arrays.toString(strs));

        int[][] mat2 = new int[2][2];
        mat2[0][0] = 99;
        mat2[0][1] = 151;
        mat2[1][0] = 30;
        mat2[1][1] = 50;
        System.out.println(Arrays.toString(mat2)+"\n");


        String[] strs2 = new String[] {"practice.geeksforgeeks.org",
                "www.geeksforgeeks.org"
        };
        System.out.println(Arrays.deepToString(strs2));

        Integer []  arr1 = {10, 20, 30, 40};
        System.out.println(Arrays.deepToString(arr1));
    }
}