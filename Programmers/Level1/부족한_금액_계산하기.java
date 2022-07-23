class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        for (int idx = 1; idx <= count; idx += 1) {
            cost += price * idx;
        }
        if (cost > money) {
            return cost - money;
        } else {
            return 0;
        }
    }
}
