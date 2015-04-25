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
public class strStr {
    public static int strStr(String haystack, String needle) {
        if ("".equals(needle) && haystack != null){
            return 0;
        }

        if (haystack == null || needle == null || needle.length() > haystack.length()){
            return -1;
        }
        
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if (haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        
        return -1;
    }  
    
    public static void main(String[] args){
        String needle = "a";
        String haystack = "a";
        System.out.println(strStr(haystack, needle));
    }
}
