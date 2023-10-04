import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng");
        int colum= scanner.nextInt();
        int sum=0;
        int[][] mang2chieu={
                {1,2,3,4},
                {6,7,8,9},
                {15,16,17,18},
                {21,22,23,24}
        };
        for (int i=0;i<mang2chieu.length;i++){
             sum += mang2chieu[i][colum];
        }
        System.out.println(sum);

    }
}
