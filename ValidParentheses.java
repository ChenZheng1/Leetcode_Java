/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author chen
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (hm.keySet().contains(c)){
                stack.push(c);
            } else if (hm.values().contains(c) && !stack.empty() && c == hm.get(stack.peek())){
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.empty();
    }
    
    public static void main(String[] args){
        String s = "(({{[]}))";
        System.out.println(isValid(s));
    }
}
