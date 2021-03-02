import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args){
        int[] a = {4, 3, 5, 12, 13, 8, 1};
        System.out.println(Arrays.toString(a));

         int y; int z;

        for (int i = 0; i < a.length; i ++){
//            System.out.println(a[i]);
            for (int j = 0; j < a.length - 1; j ++){
                if (a[j] > a[j + 1]){
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
            System.out.println("a is:\t" + Arrays.toString(a));
        }
    }
}
