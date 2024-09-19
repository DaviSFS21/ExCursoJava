import java.util.Scanner;

public class ScannerUtils {

    public static int Int() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        return x;
    }

    public static double Double() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        return x;
    }

    public static String String() {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        return x;
    }
}
