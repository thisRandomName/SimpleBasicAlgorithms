/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortjava;

import java.util.Arrays;


public class BubbleSortJava {

    
    public static void main(String[] args) {
        int[] trialarilaro={3,8,10298,77,1,55,14,21,19,9098};
        //sort : biggest in the end like a bubble popping up !!
        //then the array gets smaller in size and we sort again
        for(int i=0;i<trialarilaro.length-1;i++){
            for (int j=0;j<trialarilaro.length-1-i;j++){
                if (trialarilaro[j]>trialarilaro[j+1]){
                    int temp=trialarilaro[j];
                    trialarilaro[j]=trialarilaro[j+1];
                    trialarilaro[j+1]=temp;
                }
            }
        }
        //print ARRAY TO STRING (cause this is java..)
        System.out.println(Arrays.toString(trialarilaro));
              
       
    }
    
}
