public class Encapsulation {
    public class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

    public static void main(String[] args) {
        Encapsulation myOuterObj = new Encapsulation();
        Encapsulation.Person myInnerObj = myOuterObj.new Person();
        myInnerObj.setName( "John");  
        System.out.println(myInnerObj.getName()); 
    }

} 