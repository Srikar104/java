public class posLeft {
    public static void main(String[] args) {

        int array[] = new int[]{11,22,33,44,55,66};
        int x = 4;

        for(int i = 0; i < x; i++){
            int j, init;
            init = array[0];
            for(j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[j] = init;
        }
        System.out.println("After rotating the array: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}