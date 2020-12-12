package ru.mirea.lab5;

import java.util.Scanner;

public class Main {

    public static void f7(int n, int k) {
        if (k > n / 2) {
            System.out.print(n+" ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k+" ");
            f7(n / k, k);
        } else {
            f7(n, ++k);
        }
    }

    public static String f8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return f8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int f9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return f9(a, b - 1) + f9(a - 1, b - 1);
    }

    public static void f10(int n) {
        if (n == 0) return;
        else {
            int x = n%10;
            System.out.print(x);
            f10(n/10);
        }
    }

    public static int f11() {
        Scanner scanner = new Scanner(System.in);
        int alt ,res = 0;
        int num = scanner.nextInt();
        if (num == 1) res++;
        if (num == 0) {
            alt = scanner.nextInt();
            if (alt == num) return 0;
            else {
                if (alt == 1) res++;
                res += f11();
            }
        }
        else res += f11();
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("7 ЗАДАНИЕ:");
        f7(scanner.nextInt(), 2); //проверка 7 алгоритма сортировки
        System.out.println("");
        System.out.println("8 ЗАДАНИЕ:");
        System.out.println("SATOR AREPO TENET OPERA ROTAS - "+f8("SATOR AREPO TENET OPERA ROTAS")); //проверка 8 алгоритма рекурсии
        System.out.println("9 ЗАДАНИЕ:");
        System.out.println(f9(scanner.nextInt(), scanner.nextInt())); // проверка 9 алгоритма  рекурсии
        System.out.println("10 ЗАДАНИЕ:");
        f10(scanner.nextInt()); // проверка 10 алгоритма  рекурсии
        System.out.println("");
        System.out.println("11 ЗАДАНИЕ:");
        System.out.println(f11()); // проверка 11 алгоритма  рекурсии
    }
}
