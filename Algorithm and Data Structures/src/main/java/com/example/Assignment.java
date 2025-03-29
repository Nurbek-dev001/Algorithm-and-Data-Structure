import java.util.*;
public class Assignment {
    private static Scanner scanner = new Scanner(System.in);
    // Complexity: O(N)
    private static int Min(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        return Math.min(arr[n - 1], Min(arr, n - 1));
    }
    // Complexity: O(N)
    private static double Orta(double[] arr, int n) {
        if (n == 1)
            return arr[0];
        return ((Orta(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
    // Complexity: O(sqrt(N))
    private static boolean Jaisan(int a, int bolindi) {
        if (a <= 2)
            return (a == 2);
        if (a % bolindi == 0)
            return false;
        if (bolindi * bolindi > a)
            return true;
        return Jaisan(a, bolindi + 1);
    }
    // Complexity: O(N)
    private static int Factor(int a) {
        if (a == 0 || a == 1)
            return 1;
        return a * Factor(a - 1);
    }
    // Complexity: O(2^N)
    private static int Fibo(int a) {
        if (a == 0 || a == 1)
            return 1;
        return Fibo(a - 1) + Fibo(a - 2);
    }
    // Complexity: O(N)
    private static double Dareje(int a, int darej) {
        if (darej == 0)
            return 1;
        return a * Dareje(a, darej - 1);
    }
    private static void almastyru1(String s) {
        List<String> almastyru = new ArrayList<>();
        almastyru2("", s, almastyru);
        Collections.reverse(almastyru);
        for (String alm : almastyru) {
            System.out.println(alm);
        }
    }
    // Complexity: O(N!)
    private static void almastyru2(String koldanu1, String koldanu2, List<String> result) {
        if (koldanu2.length() == 0) {
            result.add(koldanu1);
            return;
        }
        for (int i = 0; i < koldanu2.length(); i++) {
            almastyru2(koldanu1 + koldanu2.charAt(i),
                    koldanu2.substring(0, i) + koldanu2.substring(i + 1),
                    result);
        }
    }
    // Complexity: O(N)
    private static boolean San(String s, int ind) {
        if (ind == s.length())
            return true;
        if (!Character.isDigit(s.charAt(ind)))
            return false;
        return San(s, ind + 1);
    }
    // Complexity: O(2^N)
    private static int Coef(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return Coef(n - 1, k - 1) + Coef(n - 1, k);
    }
    // Complexity: O(log(min(a, b)))
    private static int Gcd(int a, int b) {
        if (b == 0)
            return a;
        return Gcd(b, a % b);
    }
    public static void problem1() {
        System.out.print("Massiv kolemi: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Element sany: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println("Minimum: " + Min(arr, n));
    }
    public static void problem2() {
        System.out.print("Massiv kolemi: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.print("Element sany: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextDouble();
        System.out.println("Orta: " + Orta(arr, n));
    }
    public static void problem3() {
        System.out.print("Sandy engiz: ");
        int a = scanner.nextInt();
        System.out.println(Jaisan(a, 2) ? "Prime" : "Composite");
    }
    public static void problem4() {
        System.out.print("Sandy engiz: ");
        int a = scanner.nextInt();
        System.out.println("Factorial: " + Factor(a));
    }
    public static void problem5() {
        System.out.print("Sandy engiz: ");
        int a = scanner.nextInt();
        System.out.println("Fibonacci: " + Fibo(a));
    }
    public static void problem6() {
        System.out.print("Dareje esepteu: ");
        int a = scanner.nextInt();
        int darej = scanner.nextInt();
        System.out.println("Dareje: " + Dareje(a, darej));
    }
    public static void problem7() {
        System.out.print("Engiz: ");
        String input = scanner.next();
        almastyru1(input);
    }
    public static void problem8() {
        System.out.print("Engiz: ");
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(San(s, 0) ? "YES" : "NO");
    }
    public static void problem9() {
        System.out.print("Engiz coef n jane k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Binomial coefficient: " + Coef(n, k));
    }
    public static void problem10() {
        System.out.print("Engiz 2 ainymaly: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD: " + Gcd(a, b));
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1-10 tanda ");
            System.out.print("Tandau kerek: ");
            int tandau = scanner.nextInt();

            switch (tandau) {
                case 0:
                    System.out.println("Ayaktaldy,koriskenshe!");
                    return;
                case 1:
                    problem1();
                    break;
                case 2:
                    problem2();
                    break;
                case 3:
                    problem3();
                    break;
                case 4:
                    problem4();
                    break;
                case 5:
                    problem5();
                    break;
                case 6:
                    problem6();
                    break;
                case 7:
                    problem7();
                    break;
                case 8:
                    problem8();
                    break;
                case 9:
                    problem9();
                    break;
                case 10:
                    problem10();
                    break;
                default:
                    System.out.println("Tandau jok");
                    break;
            }
        }
    }
}
