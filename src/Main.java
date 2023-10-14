import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        first_non_repeated_character hashmap = new first_non_repeated_character(0, "a green apple");
        /*System.out.println(map.findFirstNonRepeatedCharacter());*/
       /* Map<String, String> map = new HashMap<>();
        map.put("123456-A", "kuromiqo");
        System.out.println(HashFunction());*/
        String str="kuromiqo";
        System.out.println(HashFunction(str));
    }
        public static int HashFunction(String key){
          int hashing=0;
          for(var ch:key.toCharArray()){
              hashing+=ch;
          }
          return hashing%100;
    }
}