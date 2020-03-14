public class MergeSortPrac {
    public static void main(String args[]){
        System.out.println("hi");
        int[] array = {2,3,1,5,4,6,8,7,9};
        int[] helper = new int[array.length];
        mergeSort(array,helper,0,array.length-1);
        for(int i = 0; i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array,int[] helper, int low, int high) {

        if (low < high) {
            int m = (low + high) / 2;
            mergeSort(array, helper, low, m);
            mergeSort(array, helper, m + 1, high);
            merge(array, helper, low, m, high);
        }
    }

    /*public static void merge(int[] arr,int[] help,int low,int m,int high)
        {
            for(int i=low ; i<=high;i++)
            {
               help[i]  = arr[i];
            }

            int helpLeft = low;
            int helpRight = m+1;
            int current = low;

            while(helpLeft <= m && helpRight <= high){

                if(help[helpLeft] <= help[helpRight]){
                    arr[current] = help[helpLeft];
                    helpLeft++;
                } else {
                    arr[current] = help[helpRight];
                    helpRight++;
                }
                current++;
            }

            int remaining = m - helpLeft;
            for(int i = 0; i <= remaining;i++){
                arr[current+1] = help[helpLeft+1];
            }

    }*/

    public static void merge(int[] array,int[] help,int low,int m,int high) {

        for (int i = low; i <= high; i++) {
            help[i] = array[i];
        }
        int i = low;
        int j = m + 1;
        int k = low;
        while (i <= m && j <= high) {
            if (help[i] <= help[j]) {
                array[k] = help[i];
                i++;
            } else {
                array[k] = help[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            array[k] = help[i];
            k++;
            i++;
        }

    }


}
