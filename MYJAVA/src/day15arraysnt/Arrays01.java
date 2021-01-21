package day15arraysnt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

  
		// create an array that has 4 int elements
		
		int a [] = new int[4];
		a[0] = 14;
		a[1] = 12;
		a[3] = 13;
		a[2] = 11;
     System.out.println(Arrays.toString(a));
     
       Arrays.sort(a);
       
      System.out.println(Arrays.toString(a));
   
   // how to put elements in ascending order
   
   char b [] = {'a', 'd', 'A', 'b', 'c', 'D'};
   
   System.out.println(Arrays.toString(b));
   
   Arrays.sort(b);
   
   System.out.println(Arrays.toString(b));
   
   
   // type a program that adds all elements in the array a
   int s = 0;
   char ch = 0 ;
   for(int i =0; i<a.length;i++) {
	   
	       s = s + a[i];
	       ch = (char) (ch + b[i]);
   }
   System.out.println("sum " +s+" and "+ ch);
    String str="";
   for(int j =0; j<b.length; j++) {
	   
	  str = str+b[j]+"*";
   }
   System.out.println(str+" ");
   
   String c[] = { "ALI", "Veli", "john", "Target", "US"};
   System.out.println(Arrays.toString(c));
   
   Arrays.sort(c);
   
   System.out.println(Arrays.toString(c));
   
   System.out.println(c.length);
   
   for(int i =0; i<c.length; i++) {
	   
	   if(i%2==0) {
		   System.out.print(c[i]+ " ");
	   }
	   
   }
   
   // how to check if a specific element exists in the array or not
   
   // to check if an element exists in an array or not we use binary search method
   //binarySearch();
   // Be Careful !!==>> Before using " binarySearch() method we have to use Sort method
   // if we use binarySearch method before Sort method, we will get result
   // but result will be incorrect
   
   int d[] = {3,5,2,12,4,3,6};
   
   Arrays.sort(d);
   
   System.out.println(Arrays.toString(d)); //[2, 3, 3, 4, 5, 6, 12, 45]
   
   //for(int i =0; i < d.length;i++) {
  // binary search method returns NON NEGATIVE VALUES IF THE ELEMENTS exists
   // if you get negative from binary search it means
   //element does not exists. and if does not exists we will get
   //NEGATIVE NUMBER WITH THE ORDER OF THE SEARCHED ELEMENT ON THE ARRAY
   System.out.println(Arrays.binarySearch(d, 12));//6
   
   System.out.println(Arrays.binarySearch(d, 9));//
   
   System.out.println(Arrays.binarySearch(d, 15));
   
   System.out.println(Arrays.binarySearch(d, 3));//
   //binary search cannot be used for repeated elements, we will get some results/
   // but it will not be meaningful result
   
	   
	    
	   
  // }
   
   
	}

}
