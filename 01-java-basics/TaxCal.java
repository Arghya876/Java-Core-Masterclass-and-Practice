import java.util.Scanner;
class TaxCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int sal = sc.nextInt();
        sc.close();
        double tax;
        if(sal<=10000){
            System.out.print("Your Salary: "+sal+", No Tax");
        }
        else if(sal>10000 && sal<=100000){
            tax = sal*0.10;
            System.out.print("Your Salary: "+sal+", Your Tax: "+tax);
        }
        else{
            tax = sal*0.20;
            System.out.print("Your Salary: "+sal+", Your Tax: "+tax);
        }
    }
}
