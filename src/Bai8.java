public class Bai8 {
    public static void main(String[] args) {
        int duongcheo1=0;
        int duongcheo2=0;
        int[][] mang2chieu={
                {1,2,3,4},
                {6,7,8,9},
                {15,16,17,18},
                {21,22,23,24}
        };
        for (int i =0;i<mang2chieu.length;i++){
            for (int j=0;j<mang2chieu[i].length;j++){
                if (i==j){
                    duongcheo1+=mang2chieu[i][j];
                }
            }
        }
        for(int i =0;i<mang2chieu.length;i++){
            for (int j = 0 ; j<mang2chieu[i].length;j++){
                if (i+j==mang2chieu.length-1){
                    duongcheo2+=mang2chieu[i][j];
                }
            }
        }
        System.out.println("Đường chéo 1 là "+duongcheo1);
        System.out.println("Đường chéo 2 là " + duongcheo2);
    }
}
