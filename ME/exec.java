package ME;

public class exec {
    
        public static void main(String[] args) {
            bank b1 = new bank("Jerso", 1234, 1000);
            bank b2 = new bank("Kachimbo", 5678, 2000);
            bank b3 = new bank("Xandico", 9012, 3000);
    
            System.out.println("Name: " + b1.getName());
            System.out.println("Account Number: " + b1.getAccountNumber());
            System.out.println("Balance: " + b1.getBalance());
            System.out.println("Yield: " + b1.yield());
            System.out.println("Name: " + b2.getName());
            System.out.println("Account Number: " + b2.getAccountNumber());
            System.out.println("Balance: " + b2.getBalance());
            System.out.println("Yield: " + b2.yield());
            System.out.println("Name: " + b3.getName());
            System.out.println("Account Number: " + b3.getAccountNumber());
            System.out.println("Balance: " + b3.getBalance());
            System.out.println("Yield: " + b3.yield());
        }

}
