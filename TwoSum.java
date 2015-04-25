/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author chen
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++){
            if (hm.containsKey(numbers[i])){
                result[0] = hm.get(numbers[i]);
                result[1] = i+1;
            } else {
                hm.put(target - numbers[i], i+1);
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
