import java.util.Scanner;
class ScannerEG {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter User Name:");

        String userName = myObj.nextLine();
        System.out.println("User Name is " + userName);

        // need a close for Scanner
        myObj.close();
    }
}