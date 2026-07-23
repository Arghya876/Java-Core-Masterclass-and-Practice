import java.util.Scanner;
public class Step08_CopyArrEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("1st Array Elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        System.out.print("\n2nd Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i]+" ");
        }
    }
}
