import java.util.Scanner;
import java.util.ArrayList;

class LocationException extends Exception{
    public LocationException(String location){
        super("We do not deliver over here " + location);
    }
}

class Blinkit{
    String location[];
    ArrayList<Product> availableProducts;

    public Blinkit(){
        location = new String[] {"Khandwa", "Indore", "Bhopal", "Gwalior", "Satna", "Mumbai"};
        availableProducts = new ArrayList<Product>();
    }

    public void addProduct(Product p){
         availableProducts.add(p); 
    }

    public void removeProduct(Product obj){
          for(Product p : availableProducts){
            if(p.getId() == obj.getId()){
                availableProducts.remove(p);
            }
          }
    }

    public void showProducts(){ 
            for(Product p : availableProducts){
                p.showProductDetails();
            }
    }
   
    public void checkLocation(String location){
        try{
        boolean flag = false;

        for(int i = 0; i < this.location.length; i++){
            if(location.equals(this.location[i])){
                System.out.println("Yes we deliver in " + this.location[i]);
                flag = true;
            }
        }

        if(!flag){
            throw new LocationException(location);
        }   
        }
        catch(LocationException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Thanks for visiting\n");
        }
       
    }
}

class User{
    private String name;
    private int age;
    private String gmail;
    private String password;
    private String location;
    private boolean isLogin;
    private double totalPrice = 0;
    private ArrayList<Product> cart;

    public User(){
    }

    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    String getGmail(){
        return this.gmail;
    }
    String getPassword(){
        return this.password;
    }
    String getLocation(){
        return this.location;
    }

    void setLocation(String location){
        if(isLogin){
            this.location = location;
        }
        else{
            System.out.println("Please login first");
        }
       
    }

    public User(String name, int age, String gmail, String password, String location){
        this.name = name;
        this.age = age;
        this.gmail = gmail;
        this.password = password;
        this.location = location;
        this.isLogin = true;
        this.cart = new ArrayList<Product>();
    }

    public void login(String gmail, String password){
        if(!this.gmail.equals(gmail) || !this.password.equals(password)){
            System.out.println("Invalid email or password");
        }
        else{
             this.isLogin = true;
            System.out.println("Login Successful");
           
        } 
    }

    public void logOut(){
        this.isLogin = false;
        System.out.println("LogOut Successfully");
    }

    public void signOut(){
        this.name = null;
        this.age = 0;
        this.gmail = null;
        this.password = null;
        this.location = null;
        this.cart = null;

        System.out.println("You signed out successfully\n");
    }

    public void showDetails(){

        if(this.password == null){
            System.out.println("User doesn't exists");
        }
        else{
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Location: " + this.location);
        }
    }

    public void isLocationAvailable(){
        if(this.isLogin){
         Blinkit store = new Blinkit();
         store.checkLocation(this.location);
        }
        else{
            System.out.println("Please login first");
        }
    }

    public void addToCart(Product p){
        if(isLogin){
            cart.add(p);
        }
        else{
            System.out.println("Please login to add to cart");
        }  
    }

    public void removeFromCart(Product obj){
        if(isLogin){
          for(Product p : cart){
            if(p.getId() == obj.getId()){
                cart.remove(p);
            }
          }
        } 
        else{
            System.out.println("Please login to remove from cart");
        } 
    }

    public void showCart(){
        if(isLogin){
            for(Product p : cart){
                p.showProductDetails();
            }
        }
    }

    public void calculatePrice(){
        
        for(Product p: cart){
            this.totalPrice += p.getPrice() * p.getQuantity();
        }
        System.out.println("Price calculated : " + this.totalPrice);
        System.out.println("Delivery Charges " + 49);
        System.out.println("Total amount to be paid : " + (this.totalPrice + 49));
    }

    public void checkOut(){
        Scanner sc = new Scanner(System.in);
        if(isLogin){
            
            System.out.println("How would like to pay");
            System.out.println("Cash on Delivery: 1");
            System.out.println("UPI: 2");
            
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Loading.....");
                System.out.println("Your order is placed successfully");
            }
            else if(choice == 2){
                System.out.println("Enter your upi id");
                String upi = sc.next(); 
                if(!upi.contains("@")){
                    System.out.println("Invalid upi id");
                }
                else{
                    System.out.println("Redirecting to upi app");
                    System.out.println("Your order is placed successfully");
                }
            }
            else{
                System.out.println("Invalid Input");
            }

        }
    }

}

class Product{
    private String name;
    private int price;
    private int quantity;
    private int id;
    private static int count;

    public Product(){
    }

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = ++count;
    }
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void showProductDetails(){
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Price: " + this.price);
        System.out.println("Product Quantity: " + this.quantity);
        System.out.println();
    }

}

class Test{
    public static void main(String args[]) throws LocationException{
        Scanner sc = new Scanner(System.in);

        User user1 = new User("Harsh Bairagi", 21, "undertake23@gmail.com", "1234567", "Sendhwa");

        user1.showDetails();
        System.out.println();

        user1.isLocationAvailable();
        System.out.println();

        
        user1.logOut();
        
        user1.login(user1.getGmail(), user1.getPassword());
        user1.setLocation("Bhopal");
        user1.isLocationAvailable();
        user1.showDetails();

        Product product1 = new Product("Rice", 250, 2);
        Product product2 = new Product("Toothbrush", 20, 2);
        Product product3 = new Product("Ball", 69, 2);

        user1.addToCart(product1);
        user1.addToCart(product2);
        user1.addToCart(product3);
        System.out.println();

        user1.showCart();
        user1.calculatePrice();
        user1.checkOut();
        user1.signOut();
        user1.showDetails();
        // for(int i = 0; i < 5; i++){
        // System.out.println("Enter the location: ");
        // String location = sc.next();
        // store.checkLocation(location);
        // }
       
        
        

        
    }
}