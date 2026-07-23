import java.util.Scanner;
class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int count=0, originalNum=num, tempNum=num;
        while (num>0) {
            num = num/10;
            count++;
        }
        int result = 0;
        while (tempNum>0) {
            int pow=1;
            int digit = tempNum%10;
            for(int i=0; count>i; i++){                
                pow = pow*digit;
            }
            result = result+pow;
            tempNum=tempNum/10;
        }
        if(originalNum==result){
            System.out.print("The Given Number is an Armstrong Number");
        }
        else{
            System.out.print("The Given Number is Not an Armstrong Number");
        }
    }
}
