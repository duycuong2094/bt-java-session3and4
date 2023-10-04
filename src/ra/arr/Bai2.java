package ra.arr;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.print("Nhập giá trị cần thêm: ");
        int them = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (từ 0 đến " + (arr.length - 1) + "): ");
        int vitri = scanner.nextInt();

        if (vitri >= 0 && vitri <= arr.length - 1) {
            int[] mangMoi = new int[arr.length + 1];

            for (int i = 0; i < vitri; i++) {
                mangMoi[i] = arr[i];
            }

            mangMoi[vitri] = them;

            for (int i = vitri; i < arr.length; i++) {
                mangMoi[i+1] = arr[i];
            }

            arr = mangMoi;
            arr[arr.length-1]=0;

            System.out.println("Mảng sau khi chèn giá trị:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Vị trí cần chèn không hợp lệ.");
        }
    }
}
