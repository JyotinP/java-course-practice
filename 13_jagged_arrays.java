// Jagged array is an array of arrays such that member arrays can be of different sizes, i.e., 
// .. we can create a 2-D array but with a variable number of columns in each row. 

class Jarray{
    public static void main(String args[]){
        int nums[][] = new int[3][];  //jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0; i <nums.length; i++){   
            for(int j=0; j < nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}