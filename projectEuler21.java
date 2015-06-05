import java.util.Arrays;

/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ¡Ù b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

public class Test {
    
    public static void main(String[] args){
    	int dp[] = new int[10000];
    	Arrays.fill(dp, 0);
    	for (int num=1; num<10000; num++) {
    		for (int i=num*2; i<10000; i+=num)
    			dp[i] += num;
    	}
    	int result = 0;
    	for (int num=2; num<10000; num++) {
    		if (dp[num]<10000 && dp[dp[num]]==num && dp[num]!=num)
    			result += num;
    	}
    	System.out.println(result);
    }
}