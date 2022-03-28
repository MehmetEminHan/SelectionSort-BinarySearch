public class SelectionSort {


    public void selectionSort(int [] array){

        for (int i = 0; i<array.length-1; i++){

            int minValue = array[i];
            int minValueIndex = i;

            for (int j = i+1; j<array.length; j++){

                if (minValue > array[j]){
                    minValue = array[j];
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i){
                array[minValueIndex] = array[i];
                array[i] = minValue;
            }
        }


    }
}
