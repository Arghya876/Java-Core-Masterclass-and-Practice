import java.util.Scanner;
class Step04_PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int originalNum = num, rev = 0;  
        while(num>0){
            int digits = num%10;
            rev = rev*10+digits;
            num = num/10;
        }
        System.out.println(rev);
        if(originalNum == rev){
            System.out.print("Given Number is Palindrome");
        }
        else{
            System.out.print("Given Number is Not Palindrome");
        }
    }
}
