import java.util.*;
public class sets{
    public static void main(String[] args) {
    ArryList<String> lists = new ArryList<String>();
    
    lists.add("kelam");
    lists.add("masa");
    lists.add("bilgisayar");
    lists.add("defter");
    lists.add(3,"dolap");
    lists.add("kalem");
    lists.add("masa");

    Systim.out.printIn(lists);
    set<String> sets = new HashSet<String>();

    sets.add("kalem");
    sets.add("masa");
    sets.add("bilgisayar");
    sets.add("defter");
    sets.add("kalem");
    sets.add("masa");

    Systim.out.printIn(sets);
    Systim.out.printIn(sets.size());
    Systim.out.printIn(sets.contains("dolab"));

    sets.clear();
    Systim.out.printIn(sets);

    sets.addAll(lists);
    Systim.out.printIn(sets);

    Systim.out.printIn(sets.get(2)); 
    }
}