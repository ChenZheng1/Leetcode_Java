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
public class ATOI {
    public static int atoi(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }

        str = str.trim();
        
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '-'){
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+'){
            i++;
        }

        double result = 0;
        
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = result * 10 + (str.charAt(i) - '0');
            i ++;
        }

        if (flag == '-'){
            result = -result;
        }
        
        if (result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else {
            return (int)result;
        }    
    }
    
    public static void main(String[] args){
        String str = "  -010aaa";
        System.out.println(atoi(str));
    }
}
