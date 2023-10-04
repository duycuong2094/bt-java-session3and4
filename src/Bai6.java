import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự");
        String kitu= scanner.nextLine();
        int cout = kitu.length();
        System.out.println("Số kí tự là" + cout);
    }
}
