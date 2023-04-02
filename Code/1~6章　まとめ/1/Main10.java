public class Main10 {
    public static void main(String[] args) {
        int x = 2;
        for (int i=1; i<=3; i++) {
            System.out.println(myPow(x, i));
        }
    }
    public static int myPow(int x, int n) {
        // x**n を返す
        int ret = 1;
        for (int i = 0; i<n; i++) {
            ret *= x;
        }
        return ret;
    }
}
