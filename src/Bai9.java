public class Bai9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int max=0;
        int max2=0;
        for (int i = 0 ;i<arr.length;i++){
            if (max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Gia trị lớn thứ 2 là "+ max2);
    }
}
