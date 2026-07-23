import java.util.Scanner;
class Step05_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        long fact=1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of the Given Number is: "+ fact);
    }
}
