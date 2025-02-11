public class Two
 {
    public static void main(String[] args) 
    {
        int[] array = {22,34,22,55,60,32,15,12,14};

        System.out.println("Original Array:");
        printArray(array);

        int[] updatedArray = removeDuplicates(array);
        
        System.out.println("Updated Array after removing duplicates:");
        printArray(updatedArray);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n]; // Temporary array to store unique elements
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if element is already present in temp array
            for (int j = 0; j < index; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If element is unique, add to temp array
            if (!isDuplicate) {
                temp[index++] = array[i];
            }
        }

        // Copy only the unique elements to a new array
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }
 }