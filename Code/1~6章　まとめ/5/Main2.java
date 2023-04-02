public class Main2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i=0; i<10; i++){
            System.out.print("Input num:");
            nums[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i=9; i>=0; i--) {
            System.out.println(nums[i]);
        }
    }
}