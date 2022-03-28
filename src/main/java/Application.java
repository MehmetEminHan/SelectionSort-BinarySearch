import javax.lang.model.type.NullType;
import java.util.concurrent.LinkedTransferQueue;

public class Application {
    public static void main(String[] args) {

        int [] array = {2,3,4,123,-1,0};
        new SelectionSort().selectionSort(array);
        new BinarySearch().binarySearch(array,-1);
        System.out.println("\n");
        new WriteArrays().writeArrays(array);

    }
}
