import java.util.Scanner;;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.print("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}