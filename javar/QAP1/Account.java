public class Account {
    // define private variables
    private String id;
    private String name;
    private int balance;

    // sets the the characteristics of an account
    public Account(String id, String name, int balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    // gets you the specific characteristic of stated account
    public String getID(){
        System.out.println();
        System.out.println(id);
        return id;
    }

    public String getName(){
        System.out.println();
        System.out.println(name);
        return name;
        
    }

    public int getBalance(){
        System.out.println();
        System.out.println("$"+ balance);
        return balance;
    }




    // money code to transfer or add/remove money
    public int credit(int amount){
        balance +=amount;
        System.out.println();
        System.out.println(balance);
        return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Amount exceeded balance. Translation: Broke.");
        }
        System.out.println("$"+balance);
        return balance;
    }

    public int transferTo(Account another,int amount){
        if(amount <= balance){
            another.balance += amount;
            this.balance -= amount;
        }else{
            System.out.println("Amount exceeded balance.");
        }
        System.out.println("NEW BALANCE IS: $"+balance);
        return balance;
    }

    public String toString(){
        return "Account[" + name + ", ID: " + id + ", Balance: " + balance;
    }
    public static void main(String[] args){

    }

}
