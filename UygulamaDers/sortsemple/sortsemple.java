import java.util;
public class sortsemple{
    public static void main(srting[] ,args);

    Arraylist<string> words = new Arraylist<string>();
    words.add("kalem");
    words.add("bilgisayar");
    words.add("bartin");
    words.add("kitab");

    system.out.printIn("dongu sonrasi :" +words);
    system.out.printIn("liste uzunlugu :" +words.size());

    for(int index =0; index < words.size(); index += 2){
        words.add(index, "*");
    }
    system.out.printIn("dongu sonrasi :" +words);
    system.out.printIn("liste uzunlugu :" +words.size());

    for(int index=0; index < words.size(); index++){
        words.remove(index);

        system.out.printIn("silme sonrasi :" +words);
        system.out.printIn("silme liste uzunlugu :" +words.size());
    }    
}