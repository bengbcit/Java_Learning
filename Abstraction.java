public class Abstraction {
    // abstract class: cannot be used to create obj but only for inheritance purpose
    abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {System.out.println("Zzz");}
    }    

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");}
    }

    public static void main(String[] args) {
        Abstraction pigOuter = new Abstraction();
        Abstraction.Pig myPig = pigOuter.new Pig();   // Create a inner Pig class object
    
        myPig.animalSound();
        myPig.sleep();
      }
}



