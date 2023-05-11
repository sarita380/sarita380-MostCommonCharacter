import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap <Character, Integer> freChrac = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
           char c = str.charAt(i);
           int count = freChrac.getOrDefault(c, 0);
           freChrac.put(c, count +1);
        }
        // to find the common char in the str
      char MostCommonCharacter = ' ';
      int highFreq =0;
      for(char c: freChrac.keySet()){
        int count = freChrac.get(c);
        if(count > highFreq){
            MostCommonCharacter = c;
            highFreq=count;
        }
      }
        return MostCommonCharacter;
    }
}
