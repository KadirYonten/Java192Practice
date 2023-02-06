public class Inheritance{

 public class Mammal {
     String name;

     public void sleep() {
         System.out.println("ZZZZ ZZZZZZ ZZZZ");
     }
 } 


 public class Dog extends Mammal {
     public void speak() {
         System.out.println("Arf! Arf!");
     }
 } 
 
 public class MorleySafer extends Mammal {
     public void speak() {
         System.out.println("Can I ask you a few questions about your 1987 tax statement?");
     }
 }

// class Speak {
     public static void main(String arg[]) {
         Dog doggie = new Dog();
         MorleySafer morley = new MorleySafer();
         doggie.name = "Cujo";
         morley.name = "Morley Safer";
         System.out.println("First we'll get the dog to speak:");
         doggie.speak();
         System.out.println("Now it's Morley's turn to speak:");
         morley.speak();
         System.out.println("Time for both to sleep:");
         doggie.sleep();
         morley.sleep();
     }
 } 
