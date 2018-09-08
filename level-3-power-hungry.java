package com.google.challenges; 
import java.math.*;
public class Answer {   
    public static String answer(int[] a) {
        int n = a.length;
        if (n == 1) return Integer.toString(a[0]);
        BigInteger min = new BigInteger(Integer.toString(Integer.MIN_VALUE));
        int count_neg = 0, count_zero = 0;
        BigInteger prod = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count_zero++;
                continue;
            }
     
            if (a[i] < 0) {
                count_neg++;
                int res = min.compareTo(new BigInteger(Integer.toString(a[i])));
                if(res == -1) {
                    min = new BigInteger(Integer.toString(a[i]));
                }
            }
     
            prod = prod.multiply(new BigInteger(Integer.toString(a[i])));
        }
     
        if (count_zero == n) return "0";
     
        if (count_neg%2==1) {
     
            if (count_neg == 1 && 
                count_zero > 0 && 
                count_zero + count_neg == n)
                return "0";
     
            prod = prod.divide(min);
        }
     
        return prod.toString();
    } 
}
