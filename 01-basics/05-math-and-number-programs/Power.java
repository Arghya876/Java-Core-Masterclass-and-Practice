import java.util.Scanner;
class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, power;
        System.out.print("Enter the Value of Number: ");
        num = sc.nextInt();
        System.out.print("Enter the Value of Power: ");
        power = sc.nextInt();
        int result = 1;
        sc.close();
        for(int i=1; i<=power; i++){
            result = result*num;
        }
        System.out.println(result);
    }    
}
