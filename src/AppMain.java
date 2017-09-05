public class AppMain {
    public static void main(String[] args) {
        int [] array = new int[]{29, 10, 70, 4, 2, 90, 13, 11, 44, 56};
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        BoobleSorter sorter = new BoobleSorter();
        array = sorter.boobleSorter(array);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
