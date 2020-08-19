/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortjava;

import java.util.Arrays;

/**
 * Divide the original problem into sub-problems:
 * divide into two sub-arrays (two halves), 
 * sort these sub-arrays and then merge them into the original array.
 * That happens RECURSIVELY .
 * [Devision happens recursively until we have 1-D arrays 
 * which -obviously - merge into SORTED 2-D arrays, 
 * which merge into SORTED 4-D arrays etc... 
 * until they all finally merge into the original-size SORTED array]
 * Mergesort is divide and conquer
 * Mergesort is recursive with time complexity O(nlogn)
 */
public class MergeSortJava {
    
    
    public static void main(String[] args) {
        int[] kikirikou={1,5,4,88,3,100,41};
        mergeSort(kikirikou,7);
      
    
         System.out.println("\n\nThe Sorted array is "+Arrays.toString(kikirikou));
    }
    
     public static void mergeSort(int[] array, int n){
        if(n<2){ //escape mergeSort==stop division and recursion
            return;
        }
        
        //find the middle
        int m=n/2;
        System.out.println(m);
        
        int[] le=new int[m]; //left sub-array
        int[] r=new int[n-m]; //right sub array
        
        for (int i=0; i<m;i++){
            le[i]=array[i];
            
        }
        
        for (int i=m; i<n;i++){
            r[i-m]=array[i];
        }
        
        //recursive devision
        mergeSort(le,m);
        mergeSort(r,n-m);
        //merge
        merge(array,le,r,m,n-m);
            
    System.out.println(Arrays.toString(array));
            
    }
    
    public static void merge(int[] array,int[] le,int[] r, int ld,int rd){
      
         int i=0, j=0, k=0; //initialization - ο πιο ευκολος τροπος μπαη φαρ με**** 3 indexes kai while loops**** 
         //ΚΑΙ ΟΧΙΙΙΙΙ ΜΕ for ΚΑΙ ΑΗΔΙΕΣ..θυμησου το μπερδεμαααα 
	 /*Θελω να ξεκινανε οι δεικτες εκει που σταματησαν ευκολα και απλα οποτε δεν μπλεκω με εμφωλευμενα φορ*/ 

	 while (i<ld && j<rd) { //there are elements in both sub-arrays
	    if (le[i] <= r[j]) {
                   array[k] = le[i]; 
                   k++;
                   i++;
	        }
	    else { array[k] = r[j];
                    k++;
                    j++;
	        }
	  }
	  while (i < ld) {  //bigger in size(length)left sub-array 
	        array[k] = le[i];
                k++;
                i++;
	   }
	   while (j < rd) {  ////bigger in size(length) right sub-array
	        array[k] = r[j];
                    k++;
                    j++;
	    }
    }
    
}
