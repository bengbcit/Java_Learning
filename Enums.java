public class Enums {
    
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(final String[] args) {
        Level myVar = Level.MEDIUM;
        switch (myVar){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
        
        for (Level myV : Level.values() ){
            System.out.println(myV);
        }
    }

}
