import java.util.Scanner;
class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum = sum+digit;
            num=num/10;
        }
        System.out.print("Sum of the Digits is: "+sum);
    }
}
