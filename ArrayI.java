public class ArrayI {

    public static void main(String[] args) {
        linearSearch();
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
                found=true
                break;
            }else if (arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1
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
        System.out.println("Reversed Array:")
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

   

}