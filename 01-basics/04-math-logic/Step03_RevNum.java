import java.util.Scanner;

class Step03_RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt(); 
        sc.close();

        int rev = 0; 

        while (num > 0) {
            int digit = num % 10;   
            rev = rev * 10 + digit; 
            num = num / 10;         
        }

        System.out.println("Reversed Number: " + rev); 
    }
}
