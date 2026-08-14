// Could use a double hashmap approach, acting as frequency maps for each character
// Iterate through the string
// and count occurence for each character,
// then store into hashmap

// Compare the two hashmaps at the end,
// if char frequencies are the same between the two hashmaps
// then the two strings are anagrams of each other

class Solution {
    public boolean isAnagram(String s, String t) { 
        HashMap<Character, Integer> frequencyMapStringS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMapStringS.put(c, frequencyMapStringS.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> frequencyMapStringT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            frequencyMapStringT.put(c, frequencyMapStringT.getOrDefault(c, 0)+1);
        }

        // Compare the two hashmaps
        if (frequencyMapStringS.equals(frequencyMapStringT)) {
            return true;
        }
        else {
            return false;
        }
    }
}
