/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author chen
 */
public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (num == null || num.length < 3){
            return result;
        }
        
        Arrays.sort(num);
        
        // num.length - 2 make sure that last three elements exists
        for (int i = 0; i < num.length - 2; i++){
            if (i == 0 || num[i] > num[i-1]){
                int neg = -num[i];
                int start = i + 1;              // next element
                int end = num.length - 1;       // last element
                    
                while (start < end){
                    // find a match
                    if (num[start] + num[end] == neg){
                        ArrayList<Integer> each = new ArrayList<>();
                        each.add(num[i]);
                        each.add(num[start]);
                        each.add(num[end]);
                        result.add(each);
                        start ++;
                        end --;
                        
                        while (start < end && num[start] == num[start-1]){
                            start ++;
                        }
                        while (start < end && num[end] == num[end+1]){
                            end --;
                        }
                    } else if (num[start] + num[end] > neg){
                        end --;
                    } else if (num[start] + num[end] < neg){
                        start ++;
                    }
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
        int[] num = {-2,-2, -1, 0, 1, 2, 3};
        System.out.println(threeSum(num));
    }
    
}
