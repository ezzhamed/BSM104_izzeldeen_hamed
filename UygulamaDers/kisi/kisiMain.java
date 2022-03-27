import java.util.Arraylist;
public class kisiMain{
    public static void main(String[] args) {
       Arraylist<kisi> bireyler = new Arraylist<>();
       
       bireyler.add(new kisi("Ahmet" , 24));
       bireyler.add(new kisi("kaya", 30));
       bireyler.add(new kisi ("Hayri", 40));

       for(kisi birey:bireyler){
           system.out.printIn("isim :" +birey.getIsim()+ ", yas :" + birey.getyas());
       }
    }
}