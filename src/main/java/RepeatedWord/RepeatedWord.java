package RepeatedWord;

import java.util.HashMap;

public class RepeatedWord {
    HashMap<Integer, String> hashMap = new HashMap<>();

    public String firstRepeatedWord(String s) {

        int count;

        if (s == " ") {
            return null;
        }

        String words[] = s.split(" ");

        for(int i = 0; i < words.length; i++) {

            count = 1;
            hashMap.put(i, words[i]);

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count ++;
                    return words[j];
                }
                return "no matches";
            }
            if (count>1) {
                return words[i];
            }
        }
        return "If there is a word above then it is a duplicate";
    }
}
