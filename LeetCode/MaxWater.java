package LeetCode;

public class MaxWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {

        //define pointer
        int start = 0;
        int end = height.length - 1;
        int max = 0;

        //1,8,6,2,5,4,8,3,7

        while (start < end) {
            //look for smallest  element because only smallest element can hold the water
            if (height[start] < height[end]) {
                //find width
                int width = end - start;
                //we multiply with smallest element against width
                int total = height[start] * width;
                //record max
                max = Math.max(total, max);
                //increment start index
                start++;
            } else {
                //find width
                int width = end - start;

                //multiply smallest element can hold the water
                int total = height[end] * width;
                //record the max
                max = Math.max(total, max);
                //decrement end index
                end--;
            }

        }
            return max;

    }
}

