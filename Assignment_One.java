/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_one;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Assignment_One {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     
  
        Random rand= new Random();

      UnOrderedArray coreData= new UnOrderedArray(1000000);
 
        
          for(int i = 0; i< 1000000; i++)
          {
          coreData.addLast(rand.nextInt(3000000)); // 3 MIL IS MAX
      
          }
        
        
    UnOrderedArray copy1= new UnOrderedArray(50);
        for (int i = 0; i < 50; i++) 
        {
            copy1.copArr(copy1.getArray());    //Here
        }
    
     long start= System.nanoTime();
     copy1.mergeSort();
     long end= System.nanoTime();
     System.out.println("Merge Sorting done.. FOR 50 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");

       for (int i = 0; i < 50; i++) 
        {
            copy1.copArr(copy1.getArray());
        }
    
         start= System.nanoTime();
        copy1.quickSort();
          end= System.nanoTime();
         System.out.println("Quick Sorting done.. FOR 50 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");
       

             
    UnOrderedArray copy2= new UnOrderedArray(1000);
        for (int i = 0; i < 1000; i++) 
        {
            copy2.copArr(copy2.getArray()); //here
        }
    
      start= System.nanoTime();
     copy2.mergeSort();
      end= System.nanoTime();
     System.out.println("Merge Sorting done.. FOR 1000 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");

     
           
    UnOrderedArray copy3= new UnOrderedArray(10000);
        for (int i = 0; i < 10000; i++) 
        {
            copy3.copArr(copy3.getArray());  //here
        }
    
      start= System.nanoTime();
     copy3.mergeSort();
      end= System.nanoTime();
     System.out.println("Merge Sorting done.. FOR 10,000 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");

     
     
    UnOrderedArray copy4= new UnOrderedArray(100000);
        for (int i = 0; i < 100000; i++) 
        {
            copy4.copArr(copy4.getArray());  //here
        }
    
      start= System.nanoTime();
     copy4.mergeSort();
      end= System.nanoTime();
     System.out.println("Merge Sorting done.. FOR 100,000 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");     
     
     
    UnOrderedArray copy5= new UnOrderedArray(1000000);
        for (int i = 0; i < 1000000; i++) 
        {
            copy5.copArr(copy5.getArray()); //here
        }
    
      start= System.nanoTime();
     copy5.mergeSort();
      end= System.nanoTime();
     System.out.println("Merge Sorting done.. FOR 1,000,000 ITEMS IT Took; "+(end-start)/1000000000.00 +"  nanoseconds");     
     
     
     
     
//      
//     System.out.println("Quick sort loading done.. Sorting started!");
//     start= System.nanoTime();
//      end= System.nanoTime();
//     System.out.println("Sorting done.. Took; "+(end-start)/1000000000.00 +"seconds");
//
//
// System.out.println("Selection sort loading done.. Sorting started!");
//     start= System.nanoTime();
//     coreData.selectionSort();
//      end= System.nanoTime();
//     System.out.println("Sorting done.. Took; "+(end-start)/1000000000.00 +"seconds");
//
// System.out.println("Insertion sort loading done.. Sorting started!");
//     start= System.nanoTime();
//     coreData.insertionSort();
//      end= System.nanoTime();
//     System.out.println("Sorting done.. Took; "+(end-start)/1000000000.00 +"seconds");
//

    
     
    }
    

}
