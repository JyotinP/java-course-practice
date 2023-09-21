class Arrays{
    public static void main(String args[]){
        int arr1[] = new int[4]; // single dimension arrays

        int arr2[][] = new int[3][4]; // multi dimensional arrays

        System.out.println(arr1); // res: [I@372f7a8d

        arr1[0] = 12;
        arr1[1] = 14;
        arr1[2] = 16;
        arr1[3] = 18;


        for(int i=0; i<4; i++){
            System.out.println(arr1[i]);
        }

        arr2[0][0] = 2;
        arr2[1][1] = 4;
        arr2[2][2] = 6;
        arr2[0][3] = 8;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        // Enhanced for loop

        for(int n[] : arr2){
            for(int m: n){
                System.out.print(m);
            }
            System.out.println();
        }

    }
}