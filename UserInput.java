import java.util.*;   //  Scanner ---> for only userInput etc, *---> for all
class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter User Name, age , salary, and reality:");

        String userName = myObj.nextLine(); // string input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        boolean reality = myObj.nextBoolean();

        System.out.println("User Name is " + userName);
        System.out.println("User age is " + age);
        System.out.println("User salary is " + salary);
        System.out.println("The reality is " + reality);
        System.out.println();

        // need a close for Scanner
        myObj.close();

        String s = "Hello true World! 3 FALSE 6 !";
        Scanner scanner = new Scanner(s);
        // find the next boolean token and print it
        // loop for the whole scanner
        while (scanner.hasNext()) {

            // if the next is boolean, print found and the boolean
            if (scanner.hasNextBoolean()) {
            System.out.println("Found :" + scanner.nextBoolean());
            }

            // if a boolean is not found, print "Not Found" and the token
            System.out.println("Not Found :" + scanner.next());
        }
        scanner.close();
    }
}