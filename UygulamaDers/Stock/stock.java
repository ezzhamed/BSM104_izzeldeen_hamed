public class stock {
    private string store;
    private int totalproduct;
    private int totalcost;

    public stock(string thestore){
        if (thestore == null){
            throw new NullpointerException();
        }
        store = thestore;
        totalproduct = 0;
        totalcost = 0;
    }
    public int getprofit(int currentprice){
        if (currentprice < 0){
            throw new IllegalArgumentException();
        }
        int marketValue = totalproduct * currentprice;
        return marketValue - totalcost;
    }
    public void purchase(int shares, int pricePerShare){
        if (shares < 0 || pricePerShare < 0){
            throw new IllegalArgumentException();
        }
        totalproduct += shares;
        totalcost += shares * pricePerShare;
    }
}