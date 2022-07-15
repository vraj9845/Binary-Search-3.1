// Time complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        for(int i=0;i<n;i++){
            int diff = n-i;
            if(diff <= citations[i]) return diff;
        }
        return 0;
    }
}
