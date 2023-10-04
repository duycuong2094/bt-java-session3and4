package ra.arr;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        int dele= scanner.nextInt();
        for (int i =0;i<arr.length;i++){
            if (arr[i]==dele){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
