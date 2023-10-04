public class Bai5 {
    public static void main(String[] args) {
        int [] arr={4,6,7,8,1,2,3,9};
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
