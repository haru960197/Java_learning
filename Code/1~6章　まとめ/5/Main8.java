import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println("Input 10 numbres");
        for (int i=0; i<10; i++) {
            nums[i] = new Scanner(System.in).nextInt();
        }
        bubbleSort(nums);
        for (int i=0; i<10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");
    }
    public static void bubbleSort(int[] nums) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<9-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int t = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}
