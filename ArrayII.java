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

    public static void maxSubArraySumII() {

        int arr[] = {1,2,3,4,5};
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
             prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;

            for(int j=i;j<arr.length;j++){
                int end = j;

                int currSum = (start == 0)
                    ? prefix[end]
                    : prefix[end] - prefix[start-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

     System.out.println(maxSum);
    }
}