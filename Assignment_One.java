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
        
   //*******************************************
     
   
   //50
   
    UnOrderedArray copy1a= new UnOrderedArray(50);
    
     //copy1.setArray(copy1.copArr(coreData.getArray())); 
        for(int i = 0; i < 50; i++){
       copy1a.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
        
        System.out.println("***********50 ITEMS*********");
     long start= System.nanoTime();
     copy1a.mergeSort();
     long end= System.nanoTime();
     System.out.println("MERGE SORT:"+(end-start)/1000000000.00 +"  nanoseconds");

 
     
     UnOrderedArray copy1b= new UnOrderedArray(50);
    
        for(int i = 0; i < 50; i++){
       copy1b.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
         start= System.nanoTime();
        copy1b.quickSort();
          end= System.nanoTime();
         System.out.println("QUICK SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
         
         
        UnOrderedArray copy1c= new UnOrderedArray(50);
      
          for(int i = 0; i < 50; i++){
       copy1c.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy1c.insertionSort();
          end= System.nanoTime();
         System.out.println("INSERTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
       
                  
        UnOrderedArray copy1d= new UnOrderedArray(50);
      
          for(int i = 0; i < 50; i++){
       copy1d.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy1d.selectionSort();
          end= System.nanoTime();
         System.out.println("SELECTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds\n");
         
//*******************************************
             
         
     System.out.println("***********1,000 ITEMS*********");

    UnOrderedArray copy2a= new UnOrderedArray(1000);
    
     //copy1.setArray(copy1.copArr(coreData.getArray())); 
        for(int i = 0; i < 1000; i++){
       copy2a.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
      start= System.nanoTime();
     copy2a.mergeSort();
      end= System.nanoTime();
     System.out.println("MERGE SORT:"+(end-start)/1000000000.00 +"  nanoseconds");

        UnOrderedArray copy2b= new UnOrderedArray(1000);
    
        for(int i = 0; i < 1000; i++){
       copy2b.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
         start= System.nanoTime();
        copy2b.quickSort();
          end= System.nanoTime();
         System.out.println("QUICK SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
         
        UnOrderedArray copy2c= new UnOrderedArray(1000);
      
          for(int i = 0; i < 1000; i++){
       copy2c.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy2c.insertionSort();
          end= System.nanoTime();
         System.out.println("INSERTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
       
                  
        UnOrderedArray copy2d= new UnOrderedArray(1000);
      
          for(int i = 0; i < 1000; i++){
       copy2d.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy2d.selectionSort();
          end= System.nanoTime();
         System.out.println("SELECTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds\n");
         
         
         
     
     
//*******************************************

     System.out.println("***********10,000 ITEMS*********");

   
  UnOrderedArray copy3a= new UnOrderedArray(10000);
    
     //copy1.setArray(copy1.copArr(coreData.getArray())); 
        for(int i = 0; i < 10000; i++){
       copy3a.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
      start= System.nanoTime();
     copy3a.mergeSort();
      end= System.nanoTime();
     System.out.println("MERGE SORT:"+(end-start)/1000000000.00 +"  nanoseconds");

        UnOrderedArray copy3b= new UnOrderedArray(10000);
    
        for(int i = 0; i < 10000; i++){
       copy3b.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
         start= System.nanoTime();
        copy3b.quickSort();
          end= System.nanoTime();
         System.out.println("QUICK SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
     
         
         UnOrderedArray copy3c= new UnOrderedArray(10000);
      
          for(int i = 0; i < 10000; i++){
       copy3c.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy3c.insertionSort();
          end= System.nanoTime();
         System.out.println("INSERTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
       
                  
        UnOrderedArray copy3d= new UnOrderedArray(10000);
      
          for(int i = 0; i < 10000; i++){
       copy3d.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy3d.selectionSort();
          end= System.nanoTime();
         System.out.println("SELECTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds\n");
         
         
         
     
//*******************************************

     System.out.println("***********100,000 ITEMS*********");

     
    UnOrderedArray copy4a= new UnOrderedArray(100000);
    
     //copy1.setArray(copy1.copArr(coreData.getArray())); 
        for(int i = 0; i < 100000; i++){
       copy4a.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
      start= System.nanoTime();
     copy4a.mergeSort();
      end= System.nanoTime();
     System.out.println("MERGE SORT:"+(end-start)/1000000000.00 +"  nanoseconds");

        UnOrderedArray copy4b= new UnOrderedArray(100000);
    
        for(int i = 0; i < 100000; i++){
       copy4b.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
         start= System.nanoTime();
        copy4b.quickSort();
          end= System.nanoTime();
         System.out.println("QUICK SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
                 
         UnOrderedArray copy4c= new UnOrderedArray(100000);
      
          for(int i = 0; i < 100000; i++){
       copy4c.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy4c.insertionSort();
          end= System.nanoTime();
         System.out.println("INSERTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
       
                  
        UnOrderedArray copy4d= new UnOrderedArray(100000);
      
          for(int i = 0; i < 100000; i++){
       copy4d.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy4d.selectionSort();
          end= System.nanoTime();
         System.out.println("SELECTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds\n"); 
     
     
  //*******************************************
   
  
       System.out.println("***********1,000,000 ITEMS*********");

  
UnOrderedArray copy5a= new UnOrderedArray(1000000);
    
     //copy1.setArray(copy1.copArr(coreData.getArray())); 
        for(int i = 0; i < 1000000; i++){
       copy5a.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
      start= System.nanoTime();
     copy5a.mergeSort();
      end= System.nanoTime();
     System.out.println("MERGE SORT:"+(end-start)/1000000000.00 +"  nanoseconds");

        UnOrderedArray copy5b= new UnOrderedArray(1000000);
    
        for(int i = 0; i < 1000000; i++){
       copy5b.addLast(coreData.getArray()[i]); //replace with addlast
        }
    
         start= System.nanoTime();
        copy5b.quickSort();
          end= System.nanoTime();
         System.out.println("QUICK SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
     
         
           UnOrderedArray copy5c= new UnOrderedArray(1000000);
      
          for(int i = 0; i < 1000000; i++){
       copy5c.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy5c.insertionSort();
          end= System.nanoTime();
         System.out.println("INSERTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds");
         
       
                  
        UnOrderedArray copy6d= new UnOrderedArray(1000000);
      
          for(int i = 0; i < 1000000; i++){
       copy6d.addLast(coreData.getArray()[i]); 
        }
    
         start= System.nanoTime();
        copy6d.selectionSort();
          end= System.nanoTime();
         System.out.println("SELECTION SORT:"+(end-start)/1000000000.00 +"  nanoseconds\n"); 
     
     
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
