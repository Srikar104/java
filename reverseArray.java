public class reverseArray {
    public static void main(String[] args) {
        int array[] = new int[]{10,33,25,98,77,32,56};

        System.out.println("Reverse order of the array is: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}