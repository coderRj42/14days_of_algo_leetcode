public class Solution{
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2 && numbers[0] + numbers[1] == target)
            return new int[]{1,2};
        var i = 0;
        var j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) j--;
            if (numbers[i] + numbers[j] < target) i++;
            if (numbers[i] + numbers[j] == target)
                return new int[]{i + 1, j + 1};
        }
        return null;
    }
}
