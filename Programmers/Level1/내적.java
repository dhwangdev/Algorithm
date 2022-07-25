class Solution {
    public int solution(int[] a, int[] b) {
        int ans = 0;
        for (int idx=0; idx<a.length; idx+=1) {
            ans += a[idx]*b[idx];
        }
        return ans;
    }
}
