public class spiral_matrix {
// conflict attempt
    public static void main(String[] args) {
        int n = 4, m = 4, k = 10;
        int[][] A = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(findK(A, m, n, k));
    }

    static int findK(int A[][], int m, int n, int k) {
        int c;
        int t = 0, d = n - 1, l = 0, r = m - 1;
        int dir = 0;
        int p = 1;

        while (t <= d && l <= r) {
            dir = 0;
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    // p = A[t][i];
                    if (p == k) {
                        return A[t][i];
                    }
                    p++;

                }
                t++;
                dir += 1;
            }
            if (dir == 1) {
                for (int i = t; i <= d; i++) {
                    // p = A[i][r];
                    if (p == k) {
                        return A[i][r];
                    }
                    p++;
                }
                r--;
                dir += 1;
            }
            if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    // System.out.println(A[d][i]);
                    // p = A[d][i];
                    if (p == k) {
                        return A[d][i];
                    }
                    p++;
                }
                d--;
                dir += 1;
            }
            if (dir == 3) {
                for (int i = d; i >= t; i--) {
                    // System.out.println(A[i][l]);
                    // p = A[i][l];
                    if (p == k) {
                        return A[i][l];
                    }
                    p++;

                }
                l++;
                dir += 1;
            }

        }
        return 0;

    }

}
