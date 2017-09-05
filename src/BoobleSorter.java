/**
 * Created by Leonid Dubravsky
 *
 * Class for Bubble sort
 */

public class BoobleSorter {
    public int[] boobleSorter(int array[]){

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
