// m-1
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }
    public void reverseArray(int[] nums, int start, int end) {
       while(start < end)
       {
           int temp = nums[start];
           nums[start++] = nums[end];
           nums[end--] = temp;
       }
    }
}

// m-2

class Solution {
  public void rotate(int[] nums, int k) {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = a[i];
    }
  }
}
