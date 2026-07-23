class Step01_ArrayDemo {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};  // 1st Type-- Dynamic Array
        // for(int i=0; i<=arr.length; i++){   // Using For Loop
        //     System.out.println(arr[i]);
        // }

        int arr1[] = new int[5]; // 2nd Type -- Static Array
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;      
        for(int indx : arr1){ 
            System.out.println(indx);
        }
    }    
}
