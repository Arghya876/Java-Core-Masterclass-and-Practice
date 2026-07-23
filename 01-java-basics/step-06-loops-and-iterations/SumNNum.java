import java.util.Scanner;
class SumNNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum+i;
        }
        System.out.print("Sum of 1 to "+num+" is: "+sum);
    }    
}
