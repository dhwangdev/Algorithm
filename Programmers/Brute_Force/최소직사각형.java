class Solution {
    public int solution(int[][] sizes) {
        int big = 0;
        int small = 0;

        for (int i=0; i<sizes.length; i++) {
            big = Math.max(big, Math.max(sizes[i][0], sizes[i][1]));
            small = Math.max(small, Math.min(sizes[i][0], sizes[i][1]));
        }

        return big * small;
    }
}
