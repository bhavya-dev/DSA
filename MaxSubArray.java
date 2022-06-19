package basictimecomplexity;

public class MaxSubArray
{
        public static int kadaneAlgo(int[] A)
        {
            int maxSoFar = Integer.MIN_VALUE;
            int maxEndingHere = 0;

            for (int i: A)
            {
                maxEndingHere = maxEndingHere + i;
                maxEndingHere = Integer.max(maxEndingHere, i);
                maxSoFar = Integer.max(maxSoFar, maxEndingHere);
            }

            return maxSoFar;
        }

        public static void main(String[] args)
        {
            int[] A = { -8, -3, -6, -2, -5, -4 };

            System.out.println("The maximum sum of a contiguous subarray is " +
                    kadaneAlgo(A));
        }
}
