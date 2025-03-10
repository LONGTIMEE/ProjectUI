package uielements;

public class User {
    private String username;
    private String password;
   // private double balance;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
      
    }

    public String getUsername() { 
        return username; 
    }

    public String getPassword() { 
        return password; 
    }

    

    // public void deposit(double amount) {
    //     balance += amount;
      
    // }
    
    // public boolean withdraw(double amount) {
    //     if (amount > balance)
    //         return false;
    //     balance -= amount;
        
    //     return true;
        
    // }

}
