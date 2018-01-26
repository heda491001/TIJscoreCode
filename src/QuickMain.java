class QuickSort2{
    public static int partition(int array[],int left, int right){
        int p,tmp,i,j;
            //Get the pivot element
             p=array[left];
             i=left;
             j=right+1;
             System.out.println("The pivot :" + p);
               for(;;){
                    //increment the lower bound till you find the element more than the pivot
                    while(array[++i]< p) if(i >= right) break;
                     //decrement  the upper bound till you find the element less than the pivot
                    while(array[--j]>p) if(j <=left) break;
                        if (i >= j) break;
                      // swap the values which are left by lower and upper bounds 
                        tmp=array[i] ;
                        array[i]=array[j];
                        array[j]=tmp;
               }
                if(j!=left){
                    tmp=array[left];
                    array[left]=array[j];
                    array[j]=tmp;
                }
               for(int k:array){
                    System.out.print(k);
                    System.out.print(",");
                }
                System.out.println();
                return j;
      }
    public static void quicksort(int a[], int left, int right){
                int i;
               if(right>left){
                    i=partition(a,left,right);
                    //System.out.println("--------------------");
                    quicksort(a,left,i-1);
                    quicksort(a,i+1,right);
             }
     }
}
public class QuickMain{
    public static void main (String[] args){
        int [] arr={65,70,75,80,85,60,55,50,45};
        QuickSort2.quicksort(arr,0,arr.length-1);
    }
}