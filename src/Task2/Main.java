package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(Math.max(a,x),c));
    }
}
