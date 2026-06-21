public class ArrayII{

    public static void main(String []args){

    }

        public static void maxSubArraySumI(){
        int arr[]={1,2,3,4,5};
        int currSum=0;
        int maxSum=Integer.Min_Value;

           for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                   currSum+=arr[i];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }

    }
}