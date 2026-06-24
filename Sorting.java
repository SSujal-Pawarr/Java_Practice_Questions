public class Sorting{
    public static void main(String []args){
        bubbleSort();
        
    }
    public static void bubbleSort(){
        int arr[]={5,1,3,6};

        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(){
        int arr[]={5,1,3,6};

        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
        }
        
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
}