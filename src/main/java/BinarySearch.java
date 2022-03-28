public class BinarySearch {

    public int binarySearch(int [] arrayAfterSort, int numberToSearch){

        int indexLow = 0;
        int indexMax = arrayAfterSort.length-1;

        while (indexMax >= indexLow){

            int indexMiddle = (indexLow + indexMax) / 2;

            if (arrayAfterSort[indexMiddle] > numberToSearch){
                indexMax = indexMiddle - 1;
            }

            else if (arrayAfterSort[indexMiddle] == numberToSearch){
                System.out.println("Your array has '"+numberToSearch+"'\n" +
                        "Index Number after selection sort:" + indexMiddle);
                return 1;
            }

            else{
                indexLow =indexMiddle + 1;
            }
        }
        System.out.println("Your array has not '"+numberToSearch+"'");
        return -1;
    }
}
