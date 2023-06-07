public class largestSmallest {
    public static void main(String[] args) {
        int array[] = new int[]{10,33,25,98,77,32,56};
        int largest = array[0];
        int smallest = array[0];
        for(int i=1; i< array.length; i++)
        {
            if(array[i] > largest)
                largest = array[i];
            else if (array[i] < smallest)
                smallest = array[i];

        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
    }
}
