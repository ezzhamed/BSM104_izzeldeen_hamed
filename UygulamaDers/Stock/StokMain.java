@@ -1,44 +0,0 @@
import java.util;
public class StokMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("ilk magaza ismi :");
        string store1 = console.next();
        stock stock1 = new stock(store1);
        int profit1 = makePurchases(stock1, console);
        
        System.out.print("ikinci magaza ismi :");
        string store2 = console.next();
        stock stoce2 = new stock(store2);
        int profit2 = makePurchases(stock2, console);

        if (profit1 > profit2) {
            System.out.printIn(store1 + "daha yararlıdır.");
        }
        else if (profit2 > profit1) {            
        System.out.printIn(store2 + "daha yararlıdır.");
        }
        else {
        System.out.printIn(store1 + "VE" + store2 + "esittir.");
        }
    }
    public static int makePurchases(stock currentStock, Scanner console){
        System.out.print("kac kez satin alma yaptin");
        int numPurchases = console.nextInt();

        for (int i = 1; i <= numPurchases; i++){
            System.out.printIn(i + ": alimda kac tane aldin ? Birim fiyat nedir");
            int numShares = console.nextInt();
            int pricePerShare = console.nextInt();
            currentStock.purchase(numShares, pricePerShare);
        }
        System.out.print("Guncel birim fiyat ?");
        int currentprice = console.nextInt();

        int profit = currentStock.getprofit(currentprice);
        System.out.printIn("Net kazanc/kayip :" + profit + "TL");
        System.out.printIn();
        return profit;
    }
}