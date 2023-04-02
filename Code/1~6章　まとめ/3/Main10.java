public class Main10 {
    public static void main(String[] args) {
        System.out.print("x:");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.print("y:");
        int y = new java.util.Scanner(System.in).nextInt();
        boolean xIsEven = x % 2 == 0;
        boolean yIsEven = y % 2 == 0;
        if( x < y &&  xIsEven && yIsEven)
            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

        if( x == y && x < 0 )
            System.out.println( "xとyは等しく、かつ、負の数である。" );

        if( x < y || xIsEven )
            System.out.println( "xはyより小さい、または、xは偶数である。" );

        if( (x <= 10 || 100 <= x) && (10 <= y && y <= 100) )
            System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

        if( !(x < 0 && y < 0) )
            System.out.println( "xもyも負の数である、ではない。" );
    }
}
