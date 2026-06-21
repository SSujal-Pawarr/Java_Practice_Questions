public class ArrayI {

    public static void main(String[] args) {
        linearSearch();
        largestNumber()
        binarySearch();
        reverseArray();
        pairsInAnArray();
        printSubarrays();
        maxSubArraySumI();
    }

    public static void linearSearch() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int value = 5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " Found");
                found = true;
                break; // stop searching once found
            }
        }

        if (!found) {
            System.out.println(value + " Not Found");
        }
    }

    public static void largestNumber(){
        int arr[]={1,2,3,4,5};
        int max=Integer.Min_Value;

        for(int i=0;i< arr.length;i++){
            max=Math.max(max,arr[i]);
        }
    }

    public static void binarySearch(){
        int arr[] = {1,2,3,4,5,6};
        int key=5;
        int start=0;
        int end=arr.length-1;
        Boolean found=false;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println(key+" Found");
                found=true;
                break;
            }else if (arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
         if(!found){
        System.out.println(key+" Not Found");
        }

    }

    public static void reverseArray(){
        int arr[]={1,2,3,4,5,6};
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void pairsInAnArray(){
        int arr[]={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

   
    public static void printSubarrays(){
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
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

    public static void kadanesAlgorithm(){
        int prices[]={7,1,5,3,6,4};
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                //profit
                int profit=prices[i]-buyPrice;
                maxProfit=MAth.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);

    }

    public static void trappedRainWater(){
        int height[]={4,2,0,6,3,2,5};
        int n=height.length;

        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            trappedWater+=waterLevel-height[i];
        }

        System.out.println(trappedWater);

    }
    
}