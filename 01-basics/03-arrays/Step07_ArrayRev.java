import java.util.Scanner;
class Step07_ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("\nEnter the Array Elements: ");
        for(int j=0; j<arr.length; j++){
            arr[j] = sc.nextInt();
        }
        sc.close();

        System.out.println("\nThe Elements are: ");
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("\nThe Revers of the Array Elements: ");
       for(int x=arr.length-1; x>=0; x--){
        System.out.print(arr[x]+" ");
       }  
    }
}
