import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subject: ");
        int subNum = sc.nextInt();
        int marks, sum=0;
        for(int i=1; i<=subNum; i++){
            System.out.print("Enter the Marks of the "+i+" Subject: ");
            marks = sc.nextInt();
            sum = sum+marks;
        }
        double Average = sum/subNum;
        System.out.print("The Average is: "+ Average);
        sc.close();
    }
}