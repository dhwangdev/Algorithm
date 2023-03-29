class Solution {
    public int[] solution(int brown, int yellow) {
        int half = (brown+4)/2;

        int hei = 3;
        int wid = half - 3;

        while (true) {
            if (hei*wid==brown+yellow) break;
            hei++;
            wid--;
        }

        return new int[] {wid, hei};
    }
}
