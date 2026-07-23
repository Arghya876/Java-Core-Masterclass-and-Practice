import java.util.Scanner;
class Step02_MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        sc.close();
        if(num1>num2){
            System.out.println("Max Number is: "+num1);
        }
        else{
            System.out.println("Max Number is: "+num2);
        }
    }    
}
