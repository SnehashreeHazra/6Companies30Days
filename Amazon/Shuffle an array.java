class Solution {
    private int[] array;
    private int[] original;
    private int[] reset;

    Random rand = new Random();
    public Solution(int[] nums) {
        original = nums.clone();
        reset = nums.clone();
        array = original;
    }

    public int[] reset() {
        return reset;
    }

    public int[] shuffle() {
        int random = rand.nextInt(array.length);
        int next = random-1;
        if(random == 0){
            next = array.length -1;
        }
        int temp = array[random];
        array[random] = array[next];
        array[next] = temp;
        return array;
    }
}



/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
