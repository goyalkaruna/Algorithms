//From Leet code

/*Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/


Solution :
//Use two pointer i and j , i is fast and j is slow
//Iterate over the string and add it to hashmap
//As soon as you find a repeated char in hashmap, use j to move ahead and start looking for new unique substring

class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max =0, j = 0;
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                
                j = Math.max(j, (map.get(s.charAt(i)))+1);
                
            }
                map.put(s.charAt(i), i);
                max = Math.max(max, i-j+1);
            
                
            
        }
        return max;
    }
}
