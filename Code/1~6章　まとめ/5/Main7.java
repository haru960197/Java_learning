import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        int[][] nums = new int[9][9];
        init(nums);
        System.out.println("Input two nums :");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        System.out.println(nums[x-1][y-1]);
    }
    public static void init(int[][] nums) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                nums[i][j] = (i+1) * (j+1);
            }
        }
    }
}
