// print 1 to 100 without using any loop
class A {
    public static void count(int n) {
        if (n <= 100) {
            System.out.println(n);
            count(n + 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A.count(1);
    }
}