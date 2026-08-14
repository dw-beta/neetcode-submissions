class Solution {
    public boolean isAnagram(String s, String t) { 
        HashMap<Character, Integer> frequencyMapStringS = new HashMap<>();
        // iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // count each occurence of each character
            char c = s.charAt(i);
            frequencyMapStringS.put(c, frequencyMapStringS.getOrDefault(c, 0) + 1);
        }
    
        HashMap<Character, Integer> frequencyMapStringT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            frequencyMapStringT.put(c, frequencyMapStringT.getOrDefault(c, 0) + 1);
        }

        // compare the two hashmaps
        if (frequencyMapStringS.equals(frequencyMapStringT)) {
            return true;
        }
        else {
            return false;
        }
    }
}
