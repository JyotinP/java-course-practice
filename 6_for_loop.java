class For_loop {
    public static void main(String arg[]){

        // For Loop
        for(int i = 1; i<=5; i++){    
            System.out.println("hi " + i);
        }

        int nums[] = new int[3];
        nums[0] = 4;
        nums[1] = 6;
        nums[2] = 8;

        // Enhanced For Loop
        for(int n: nums){ 
            System.out.println(n);
        }

    }
}
