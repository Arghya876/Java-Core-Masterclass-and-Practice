import java.util.Scanner;
class Step10_OddNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        sc.close();
        int sumEven=0, sumOdd=0;
        if(num%2==0){
            System.out.println("Given Number is Even");
            for(int i=0; i<=num; i=i+2){
                sumEven = sumEven+i;
            }
            System.out.print("Sum of Given Even Number is: "+sumEven);
        }
        else{
            System.out.println("Given Number is Odd");
            for(int i=1; i<=num; i=i+2){
                sumOdd = sumOdd+i;
            }
            System.out.print("Sum of Given Odd Number is: "+sumOdd);
        }
    }    
}

