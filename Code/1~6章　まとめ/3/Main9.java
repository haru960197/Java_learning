public class Main9 {
    public static void main(String[] args) {
        int day = new java.util.Scanner(System.in).nextInt();
        int time = new java.util.Scanner(System.in).nextInt();
        boolean isOpen = judge(day, time);
        if (isOpen) System.out.println("Open");
        else        System.out.println("Close");
    }
    public static boolean judge(int day, int time) {
        switch (day) {
            case 0 :
                return false;
            case 2 :
                if (time == 0) return false;
                else           return true;
            case 3 :
                if (time == 2) return false;
                else           return true;
            case 5 :
                if (time == 0) return false;
                else           return true;
            case 6 :
                if (time == 0) return true;
                else           return false;
            default :
                return true;
        }
    }
}