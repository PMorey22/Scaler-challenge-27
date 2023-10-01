import java.util.Arrays;

public class gfg_addones {
    public static void main(String[] args) {
        int n = 3, k = 4;
        int[] a = { 0, 0, 0 };
        int[] updates = { 1, 1, 2, 3 };
        update(a, n, updates, k);
    }

    static void update(int a[], int n, int updates[], int k) {
        // Your code goes here
        for (int i = 0; i < k; i++) {
            int icr = updates[i];
            for (int j = icr - 1; j < n; j++) {
                a[j]++;
            }
            System.out.println(Arrays.toString(a));

        }

        // for(int l=0;l<n;l++){
        // System.out.print(a[l]+" ");
        // }
    }
}