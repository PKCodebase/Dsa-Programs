package set;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
        public boolean isHappy(int n) {
            Set<Integer> value = new HashSet<>();

            while (n != 1) {
                if (value.contains(n)) {
                    return false;
                }
                value.add(n);
                n = sumOfSquares(n);
            }
            return true;
        }

        private int sumOfSquares(int n) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            return sum;
        }

    public static void main(String[] args) {
            HappyNumber solution = new HappyNumber();
            System.out.println(solution.isHappy(19)); // true
            System.out.println(solution.isHappy(2));  // false
        }


}
