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
}