/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

/**
 *
 * @author chen
 */
public class Pow {
    public static double pow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return power(x, n);
        }
    }
    
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (x == 0 || x == 1){
            return x;
        }
        
        double half = power(x, n/2);
        
        if (n%2 == 0){
            return half * half;
        } else {
            return half * half * x;
        }

    }
    
    public static void main(String[] args){
        System.out.println(pow(2,5));
        System.out.println(pow(2,-1));
    }
}
