package Dataexample;

public class StringMatcher {
    public static int[] computeLps(String p) {
        int m = p.length();
        int[] r = new int[m + 1];
        r[1] = 0;
        int k = 0;
        for (int q = 2; q <= m; q++) {
            while (k > 0 && p.charAt(k) != p.charAt(q - 1)) {
                k = r[k];
            }
            if (p.charAt(k) == p.charAt(q - 1)) {
                k++;
            }
            r[q] = k;
        }
        return r;
    }

    public static void kmpMatcher(String S, String P) {
        int n = S.length();
        int m = P.length();
        int[] r = computeLps(P);
        int q = 0;
        for (int i = 0; i < n; i++) {
            while (q > 0 && P.charAt(q) != S.charAt(i)) {
                q = r[q];
            }
            if (P.charAt(q) == S.charAt(i)) {
                q++;
            }
            if (q == m) {
                System.out.println("Pattern occurs with shift " + (i - m + 1));
            }
        }
    }
}
