class Solution{
    public int lenghtofLongestSubstring(String s) {
        int maxlength = 0;
        for (int i = 0; i < s.length();i++) {
            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxlength = Math.max(maxlength, currentSubstring.length());
            }
        }
        return  maxlength;
    }

}
public class NormalSolution {
    public static void main(String[] args) {
        Solution str= new Solution();
        String Str ="jakakaria";
        System.out.println(str.lenghtofLongestSubstring(Str));
    }
}