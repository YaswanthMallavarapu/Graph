class Solution {
    public static void dfs(int[][] image, int ans[][], int sr, int sc, int color, int oldColor, int[] cold,
            int rowd[]) {
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < 4; i++) {
            int newr = sr + cold[i];
            int newc = sc + rowd[i];
            if (newr >= 0 && newr < n && newc >= 0 && newc < m && image[newr][newc] == oldColor
                    && ans[newr][newc] != color) {
                dfs(image, ans, newr, newc, color, oldColor, cold, rowd);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int initialColor = image[sr][sc];
        int cold[] = { -1, 1, 0, 0 };
        int colr[] = { 0, 0, -1, 1 };
        dfs(image, ans, sr, sc, color, initialColor, cold, colr);
        return ans;
    }
}