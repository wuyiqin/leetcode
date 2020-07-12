import java.util.Arrays;

import sun.net.www.content.audio.basic;

/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    //
    public String longestPalindrome(String s) {
        if(s.length() <2){
            return s;
        }
        char[] sa = s.toCharArray();
        int start= 0;
        int len = 1;
        for(int i=0;i<sa.length;i++){
            //1, 偶数子串
            for(int j =0 ; i-j>=0 && i+j+1<sa.length;j++){
                if(sa[i-j] != sa[i+j+1]){
                    break;
                } else {
                    if (2*j+2 >len){
                        start = i-j;
                        len = 2*j+2;
                    }
                }
            }
            // 2 奇数子串
            for(int j =1; i-j>=0 && i+j <sa.length;j++){
                if(sa[i-j] !=sa[i+j]){
                    break;
                } else {
                    if(2*j +1 >len){
                        start =i-j;
                        len = 2*j +1;
                    }
                }
                // System.out.println(""+start+" "+len);
            }


        }        
        // System.out.println(""+start+" "+len);
        return String.copyValueOf(sa,start,len);
    }




    // Time Limit Exceeded
    public String longestPalindrome_TLE(String s) {
        if(s.length() <2){
            return s;
        }
        char[] sa = s.toCharArray();
        // 需要两层循环, 判断还有一层循环；
        int  maxLen = 1;
        int startI = 0;
        for (int i=0; i < sa.length;i++){
            for(int l = 1; i+l <= sa.length;l++){
                if(isPalindrome(Arrays.copyOfRange(sa, i, i+l))){
                    if (l>maxLen){
                        maxLen = l;
                        startI = i;
                    }
                }
            }
        }
        return String.copyValueOf(sa, startI, maxLen);
        // Arrays.copyOfRange(sa, startI, maxLen));
        
    }

    public boolean isPalindrome(char[] s){
        for(int i =0 ;i< s.length/2;i++){
            if(s[i] != s[s.length -1 -i]){
                return false;
            }
        }
        return true;

    }
}
// @lc code=end

