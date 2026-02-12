/*
LEETCODE - 744. FIND SMALLEST LETTER GREATER THAN TARGET

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
*/

class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int st = 0 , en = letters.length-1;
        char ans = letters[0];
        while(st<=en){
            int mid = st + (en-st)/2;
            
            if(target<letters[mid]){
                ans = letters[mid];
                en = mid-1;
            }
            else
            st = mid+1;
        }
        return ans;
    }
}