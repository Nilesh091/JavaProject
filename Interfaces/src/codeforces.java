import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            int ld = 0, rd = n * (n - 1) / 2;
            for (int i = 1, cd = 0; i <= n; ++i) {
                if ((i & (i - 1)) == 0) ++cd;
                ld += cd - 1;
            }
            if (!(ld <= d && d <= rd)) {
                System.out.println("NO");
                continue;
            }

            int[] par = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i - 1;
            }

            int[] cnt = new int[n];
            Arrays.fill(cnt, 1);
            cnt[n - 1] = 0;

            int[] bad = new int[n];

            int[] dep = new int[n];
            for (int i = 0; i < n; i++) {
                dep[i] = i;
            }

            int cur = n * (n - 1) / 2;
            while (cur > d) {
                int v = -1;
                for (int i = 0; i < n; ++i) {
                    if (bad[i] == 0 && cnt[i] == 0 && (v == -1 || dep[v] > dep[i])) {
                        v = i;
                    }
                }
                assert v != -1;
                int p = -1;
                for (int i = 0; i < n; ++i) {
                    if (cnt[i] < 2 && dep[i] < dep[v] - 1 && (p == -1 || dep[p] < dep[i])) {
                        p = i;
                    }
                }
                if (p == -1) {
                    bad[v] = 1;
                    continue;
                }
                assert dep[v] - dep[p] == 2;
                --cnt[par[v]];
                --dep[v];
                ++cnt[p];
                par[v] = p;
                --cur;
            }

            System.out.println("YES");
            for (int i = 1; i < n; ++i) {
                System.out.print((par[i] + 1) + " ");
            }
            System.out.println();
        }
    }
}

