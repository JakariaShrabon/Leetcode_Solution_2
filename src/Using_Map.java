import java.util.HashMap;

class Map{
   public int lenghtofLongestSubstring(String s) {
       int maxLength = 0;
       HashMap<Character, Integer> visitedCharacters = new HashMap<>();
       for (int right = 0, left = 0; right < s.length();right++)
       {
           char currentCharactor = s.charAt(right);
           if(visitedCharacters.containsKey(currentCharactor) && visitedCharacters.get(currentCharactor)>=left)
           {
               left= visitedCharacters.get(currentCharactor)+1;
           }
           maxLength= Math.max(maxLength,right-left+1);
           visitedCharacters.put(currentCharactor,right);
       }
       return maxLength;

   }
}
public class Using_Map {
    public static void main(String[] args) {
        Solution str= new Solution();
        String Str ="jakakaria";
        System.out.println(str.lenghtofLongestSubstring(Str));
    }
}
