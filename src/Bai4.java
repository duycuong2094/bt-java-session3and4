public class Bai4 {
    public static void main(String[] args) {
        int [][] mang2chieu={
                {0,1,2,3,4,5},{6,25,8,9,10}
        };
        int max=0;
        for (int i =0 ;i< mang2chieu.length;i++){
            for (int j=0;j<mang2chieu[i].length;j++){
                if (max<=mang2chieu[i][j]){
                    max=mang2chieu[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
