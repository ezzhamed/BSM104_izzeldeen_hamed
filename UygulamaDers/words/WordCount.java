import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws FileNotFountException {
        WordCount();   
    }

    public static void countWords() throws FileNotFountException{
        scanner input = new scanner(new File ("test.txt"));

        set<String> words = new HashSet<String>();

        while(input.hasNext()){
            String word = input.next().toLowerCase();
            words.add(word);
        }
        Systim.out.printIn("kelimeler" + words);
        Systim.out.printIn("kelime sayisi :" words.size());

        for(String word : words)
            Systim.out.printIn(word);
    }
}