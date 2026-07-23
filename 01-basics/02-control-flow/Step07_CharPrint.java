import java.util.Scanner;
class Step07_CharPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println(ch); 
    }    
}
