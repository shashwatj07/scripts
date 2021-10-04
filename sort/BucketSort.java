import java.util.*;



//import java.util.Map.Entry;
import java.math.BigInteger;


import java.io.*;
//import java.math.*;
//import static java.util.stream.Collectors.*;
//import static java.util.Map.Entry.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BucketSort
{
	public static void main (String[] args) throws IOException
	{
		
		
		  PrintWriter pt=new PrintWriter(System.out);
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  

          { 
           int arr[]=new int[10];
           Random random=new Random();
           for(int i=0; i<arr.length; i++)
           {
             arr[i]=random.nextInt(100)-50;
           }
           pt.println(Arrays.toString(arr));
           bucketsort(arr);
           pt.println(Arrays.toString(arr));
          }
          pt.close();
      
        }
        public static void bucketsort(int[] arr)
        {
          int max=max(arr);
          int min=min(arr);
          int num=max-min+1;

          List<List<Integer>> buckets=new ArrayList<>(num);

          for(int j=0; j<num; j++)
          {
            buckets.add(new ArrayList<>());
          }

          for (int value : arr) {
            int hash = hash(value, min, num);
            buckets.get(hash).add(value);
          }
         
          for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
          }
      
          int index = 0;
          for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
              arr[index++] = value;
            }

        }
      }

      private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
      }


      public static int max(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
          if (value > max)
          {
            max = value;
          }
        }
        return max;
      }

      public static int min(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
        if (value < min)
        {
            min = value;
        }
        }
        return min;
      }

    }

   

		