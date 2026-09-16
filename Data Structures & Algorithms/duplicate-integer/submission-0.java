

class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int[] distinctNums = Arrays.stream(nums).distinct().toArray();
        
        return distinctNums.length != nums.length;
    }
}