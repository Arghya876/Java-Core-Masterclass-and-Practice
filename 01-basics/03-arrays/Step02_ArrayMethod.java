import java.util.Arrays;
class Step02_ArrayMethod {
    public static void main(String[] args) {
        String arr[] = {"Arghya", "Koushik", "Swastika", "Sohini", "Raj"};
        System.out.println("toString(): "+Arrays.toString(arr));
        System.out.println("asList(): "+Arrays.asList(arr));
        int arr1[][] = {{10,20},{30,40},{50,60}};
        System.out.println("deeptoString(): "+Arrays.deepToString(arr1));
    }    
}
