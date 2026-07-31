package inheritance1_31_07;

public class Main{

  public static void main(String[] args) {
    
    Developer developer = new Developer();

    developer.id = 1;
    developer.name = "John";
    developer.programmingLanguage = "Java";

    System.out.println("Developer ID: " + developer.id);
    System.out.println("Developer Name: " + developer.name);
    developer.writeCode();

  }

}
