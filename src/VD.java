import java.lang.Math;
import java.util.Scanner;

public class VD {
    /*public static int sum(int[] a){
        int ans=0;
        for (int i=0; i<a.length; i++){
            if (a[i]>0 ){
                if (a[i]%2==0) {
                    ans += a[i];
                    break;
                }
            }

        }
        return ans;
    }
    public static void main (String[] args){
        int[] a= new int[]{-2, 1, 8, 2, -6, 7};
        System.out.println(sum(a));
    }

     */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println("So " + a + " khong co dang 2^k");
        }
        boolean b=false;

        for (int k = 1; k < a; k++) {
            if (a == Math.pow(2, k)){
                b=true;
                break;
            }
            else continue;
        }
        System.out.println(b);


        /*while (a>1){
            if (a%2!=0){
                System.out.println("So "+ a+" khong co dang 2^k");
            }
            else if (a/2==0){

            }
        }
    }

         */
    }
}
