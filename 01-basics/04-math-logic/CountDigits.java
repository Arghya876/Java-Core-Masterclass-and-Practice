import java.util.Scanner;
// class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         String num = sc.nextLine();
//         sc.close();
//         int count = num.length();
//         System.out.println("The Number of the Digits: "+ count);
//     }
// }

// <-----------------OR---------------------->

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while (num>0) {
            num=num/10;
            count++;
        }
        System.out.println("The Number of the Digits: "+ count);
    }
}
