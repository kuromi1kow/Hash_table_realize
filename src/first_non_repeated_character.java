import java.util.HashSet;
import java.util.Hashtable;

public class first_non_repeated_character {
    private int count;
    private String words;
    private int num;
    private Hashtable<Character, Integer> charCount;
    private HashSet<Character> set;

    public first_non_repeated_character(int num,String words){
        this.num=num;
        this.words=words;
        charCount=new Hashtable<>();
        set=new HashSet<>();
    }

    public char findFirstNonRepeatedCharacter(){
        for(int i=0;i<words.length();i++){
            char currentChar=words.charAt(i);
            charCount.put(currentChar,charCount.getOrDefault(currentChar,0)+1);
        }
        for(int i=0;i<words.length();i++){
            char currentChar=words.charAt(i);
            if(charCount.get(currentChar)<=2)
                return currentChar;
        }
        return '\0';
    }


    public char findFirstnonrepch(String str) {
        var chars = str.toCharArray();
     /*   for(var ch:chars){
            var count = charCount.get(ch);
           if( charCount.containsKey(ch)) charCount.put(ch, count);
           else charCount.put(ch,0);
        }*/
        for (var ch : chars) {
            var count = charCount.containsKey(ch) ? charCount.get(ch) : 0;
            charCount.put(ch, count + 1);
        }
        for (var ch : chars) {
            if (charCount.get(ch) == 1) return ch;
        }
        return Character.MIN_VALUE;
    }

    public char firstrepeatedChar(String str){
        var chars=str.toCharArray();
        for(var ch:chars)
            if(set.contains(ch)) return ch;
            else set.add(ch);

        return Character.MIN_VALUE;
    }
}