public class TestAccount {


    public static void main(String[] args){
        Account acc1 = new Account("Bfh3u324", "Matthew Verge",5000);
        Account acc2 = new Account("Ndj29ifu", "shogun show",4000);

        acc1.getName();
        acc1.getID();
        acc1.getBalance();
        
        acc2.getName();
        acc2.getID();
        acc2.getBalance();


        acc1.transferTo(acc2, 1000);

        acc1.getBalance();
        acc2.getBalance();
    }
}
