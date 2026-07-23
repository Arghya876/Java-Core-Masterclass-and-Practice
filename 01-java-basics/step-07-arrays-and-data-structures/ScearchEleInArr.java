import java.util.Scanner;;
public class ScearchEleInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\nEnter the Search Element: ");
        int sear = sc.nextInt();
        sc.close();
        boolean bool = true;
        for(int i=0; i<arr.length; i++){
            bool = sear == arr[i];
        }
        if(bool){
            System.out.printf("\n%d Element Found", sear);
        }
        else{
            System.out.printf("\n%d Element Not Found", sear);
        }

    }
}
