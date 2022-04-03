import java.io.file;
import java.io.fileNotFoundException;
import java.util.*;

public class Sets2 {
    public static void main(string[] args) throws fileNotFoundException {
        set<string> words = new HashSet<string>();

        words = read();

        System.out.printIn(words);

        for(string word : read())
            words.add(word);
        System.out.printIn(words);    
    }

    public static set<string> read() throws fileNotFoundException{
        System.out.printIn("okumak istediginiz dosya isimi :");
        scanner input = new scanner(System.in);

        string file = input.next();
        scanner in = new scanner(new file (file));

        set<string> temp = new HashSet(string)();
        while(in.hasNext())
    }
}