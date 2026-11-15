
class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        
        for (String str : strs) {
            // Append the length, the delimiter '#', and the actual string
            encodedString.append(str.length()).append("#").append(str);
        }
        
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0; // The main pointer to traverse the string
        
        while (i < str.length()) {
            int j = i;
            
            // Move pointer 'j' forward until it finds the '#' delimiter
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the number before the '#' to find out the string's length
            int length = Integer.parseInt(str.substring(i, j));
            
            // The actual string starts exactly one character after 'j' 
            // and ends 'length' characters later
            int stringStart = j + 1;
            int stringEnd = stringStart + length;
            
            result.add(str.substring(stringStart, stringEnd));
            
            // Move the main pointer 'i' forward to the start of the next encoded string
            i = stringEnd;
        }
        
        return result;
    }
}