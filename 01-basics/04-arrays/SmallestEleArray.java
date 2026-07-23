import java.util.Scanner;
public class SmallestEleArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min Value of the Array is: "+min);
        
    }
}
