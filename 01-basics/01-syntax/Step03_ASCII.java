import java.util.Scanner;
class Step03_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        int ascii = ch;
        System.out.println("The ASCII Value of the Given Character is: "+ascii);
    }    
}