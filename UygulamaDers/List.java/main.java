public class main{

    public static void main(String[] args){
        LinkedIntList linkList = new LinkedIntList();
        linkList.add(5);
        linkList.add(7);
        linkList.add(9);
        Systim.out.printIn(linkList.toString());

        linkList.add(0, 11);
        Systim.out.printIn(linkList.toString());
        linkList.add(2, 15);
        Systim.out.printIn(linkList.toString());

        int count = linkList.size();
        String.out.printIn(count);
    }
}