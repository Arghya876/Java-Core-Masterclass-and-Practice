import java.util.Scanner;
public class Step03_SumArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("The Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.printf("\nThe Sum of the Array Elements: %d", sum);
    }
}
