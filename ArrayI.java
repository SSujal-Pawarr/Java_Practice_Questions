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
    }
    if(!found){
        System.out.println(key+" Not Found");
    }
}