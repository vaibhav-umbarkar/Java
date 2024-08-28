public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Traversing
        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Searching
        int searchKey = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey) {
                index = i;
                break;
            }
        }
        System.out.println("\nElement " + searchKey + " found at index: " + index);

        // Insertion (not applicable in fixed size arrays, here we demonstrate using a new array)
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = 60;
        System.out.println("Array after insertion:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }

        // Deletion
        int[] newArrAfterDeletion = new int[arr.length - 1];
        int deleteKey = 2; // Deleting the element at index 2
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == deleteKey) {
                continue;
            }
            newArrAfterDeletion[k++] = arr[i];
        }
        System.out.println("\nArray after deletion:");
        for (int i : newArrAfterDeletion) {
            System.out.print(i + " ");
        }
    }
}
