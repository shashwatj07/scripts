package sorting;
import java.util.Scanner;
public class QuickSorting
{
    /*QUICK SORT:Method that consider last element as pivot,
      the pivot is placed at its exact position, and
      smaller elements are placed to left of pivot and greater
      elements to right of pivot.*/
   static int partition (int[] a, int start, int end)
    {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {

            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return (i + 1);
    }

    /* Method to implement quick sort */
    static void quick(int[] a, int start, int end)
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    // Method to print an array
    static void printArray(int[] a, int n)
    {

        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the desired array:");
        int n =sc.nextInt() ;
        int[] a =new int[n];
        System.out.println("Enter your array :");
        for (int i = 0; i < n; i++){
            a[i]= sc.nextInt();
        }
        quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are : ");
        printArray(a, n);

    }
}