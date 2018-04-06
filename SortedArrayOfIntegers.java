package RecursivePuzzels;
import java.util.Arrays;
public class SortedArrayOfIntegers {
	
	        private static int data[] = {25,45,23,25,10,14,5,6};
	        
	        public static int recursiveBinarySearch (int d[], int g, int left, int right) {
	            
	             Arrays.sort(data);
	             
	            int middle = (left + right)/2;
	            if (d[middle] != g && left <= right) {
	                if (d[middle] > g) 
	                    return recursiveBinarySearch (d, g, left, middle-1);
	                else 
	                    return recursiveBinarySearch (d, g, middle+1, right);
	            }
	            if (d[middle] == g) return middle;
	            else return -1;
	        }
	        
	        public static void main (String [] args) {
	            int goal = 20;
	            int result = recursiveBinarySearch(data, goal, 0, data.length-1);
	            if (result < 0) System.out.println("The specified value could not be find: " + goal);
	            else System.out.println("The index of the value" + goal + " was found at: " + result);
	        }
	    }    
