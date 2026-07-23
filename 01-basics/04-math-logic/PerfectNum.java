import java.util.Scanner;
class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int result = 0, originalNum=num;
        for(int i=num-1; i>0; i--){
            if(num%i==0){
                result = result+i;
            }
        }
        if(result==originalNum){
            System.out.println("Given Number is a Prefect Number");
        }
        else{
            System.out.println("Given Number is Not a Prefect Number");
        }
    }
}
