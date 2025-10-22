class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq = new int[value];

        for(int num : nums){
            int d = ((num % value) + value) % value;
            freq[d]++;
        }

        int p = 0;
        while(true){
            int r = p % value;
            if(freq[r] == 0){
                return p;
            }
            freq[r]--;
            p++;
        }
    }
}
