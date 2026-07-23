import java.util.Scanner;
class Step03_MaxInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        num3 = sc.nextInt();
        sc.close();

        if (num1>num2 && num1>num3) {
            System.out.print("Max Value is: "+num1);
        }
        else if (num2>num1 && num2>num3) {
            System.out.print("Max Value is: "+num2);
        }
        else{
            System.out.print("Max Value is: "+num3);
        }   
    }    
}
