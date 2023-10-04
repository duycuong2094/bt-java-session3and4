package ra.arr;

import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       sum(scanner);
    }
    public static void sum(Scanner scanner){
        System.out.println("Nhập số thứ nhất");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ 2");
        int b =scanner.nextInt();
        System.out.println("Tổng là :" +(a+b));
    }
}
