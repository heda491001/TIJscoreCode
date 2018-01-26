 public static void doSelectionSort(int[] array) {
   int min, tmp;
   for (int i = 0; i < array.length-1 ; i++) {
       min = i;
       for (int j = i+1; j < array.length; j++) {
             if (array[j] < array[min]) 
                   min = j;
        }     
       tmp = array[min];
       array[min] = array[i];
       array[i] = tmp;
    }
 }
