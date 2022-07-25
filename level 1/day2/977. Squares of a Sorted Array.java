class Solution {
    public int[] sortedSquares(int[] a) {
        
        int[] ans = new int[a.length];
        int i = 0, j = a.length - 1, k = a.length - 1;
        
        while (k >= 0) {
            if (Math.abs (a[i]) > Math.abs (a[j])) {
                ans[k--] = a[i] * a[i++];
            }
            else {
                ans[k--] = a[j] * a[j--];
            }
        }
        
        return ans;
    }
}
