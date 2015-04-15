/*
 * 原题链接：https://leetcode.com/problems/valid-palindrome/
 * 2015.04.15
 *
 * 主要知识点：无
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        /* 测试 */
    }
}

class Solution {
    public boolean isPalindrome(String string) {
        if (string == null) {
            return false;
        } else if (string.isEmpty()) {
            return true;
        }

        string = string.toLowerCase();
        int head = 0;
        int tail = string.length() - 1;

        for( ; head <= tail; ) {
            char ch = string.charAt(head);
            char ct = string.charAt(tail);
            if (!('a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9')) {
                head++;
                continue;
            }
            if (!('a' <= ct && ct <= 'z' || '0' <= ct && ct <= '9')) {
                tail--;
                continue;
            }
            if (ch == ct) {
                head++;
                tail--;
            } else {
                return false;
            }
        }

        return true;
    }
}
