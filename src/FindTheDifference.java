/*
389. Find the Difference
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.

 */
public class FindTheDifference {
    // by subtraction
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int c=(int)ct[0];
        for (int i = 0; i < cs.length; i++) {
            //注意先后顺序，需要减的是s;
            c+=(ct[i+1]-cs[i]);
        }
        return (char)c;

    }

    //faster bit manipulation; 5ms;
    public char findTheDifference2(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        char res = ct[0];
        for (int i = 0; i < cs.length; i++) {
            res ^= cs[i];
            res ^= ct[i + 1];
        }
        return res;

    }


    //bit manipulation O(m+n); 6ms;
    public char findTheDifference2(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        char res = ct[0];
        for (int i = 0; i < cs.length; i++) {
            res ^= cs[i];
        }
        for (int i = 1; i < ct.length; i++) {
            res ^= ct[i];
        }
        return res;

    }
}
