public class Bai3 {
    public static void main(String[] args) {
        int[] arr1=new int[3];
        int[] arr2=new  int[3];
        int[] arr3=new int[6];
        for (int i = 0 ; i<arr1.length;i++){
            arr1[i]=i;
            arr3[i]=arr1[i];
        }
        for (int j=0;j<arr2.length;j++){
            arr2[j]=j+3;
            arr3[arr1.length+j]=arr2[j];

        }
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
