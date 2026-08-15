// Turn string into lowercase
// Clean the string
// Reverse the string
// Compare reversed string to cleaned string
// If same then palindrome

class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();
        String cleanedString = lowerCaseString.replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        if (reversedString.equals(cleanedString)) {
            return true;
        }
        else {
            return false;
        }
    }
}