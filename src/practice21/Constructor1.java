package practice21;

public class Constructor1 {

      String title;
    double price; 


public Constructor1(){

    this.title = "Unknown";
        this.price = 0.0;

}

public Constructor1(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Book Title: " + this.title + " | Price: ₹" + this.price);
    }

    public static void main(String[] args) {
     


        // Creating object 1 using the DEFAULT constructor
        System.out.print("Book 1 (Default): ");
        Constructor1 b1 = new Constructor1();
        b1.display();

        // Creating object 2 using the PARAMETERIZED constructor
        System.out.print("Book 2 (Parameterized): ");
        Constructor1 b2 = new Constructor1("Java Basics", 499.0);
        b2.display();
    }
    
}
