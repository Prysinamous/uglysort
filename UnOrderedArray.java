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
public class UnOrderedArray {
    
    private int[] m_array;
    private int maxSize;
    private int numElements;
    
    public UnOrderedArray(int size)
    {
        maxSize=size;
        m_array= new int[maxSize];
        numElements=0;
    }
    
    public boolean addLast(int item)
    {
        if (numElements < maxSize)
        {
            m_array[numElements]= item;
            numElements++;
            return true;
        }
        return false;
    }
    
public int[] copArr(int[] copy1)
    {
        int [] copArr;
    copArr = m_array;

        for (int i = 1; i < m_array.length; i++)
    {
        copArr[i] = m_array[i];
    }
    return copArr;
}
    
    
    
    public int[] getArray()
    {
        return this.m_array; 
    }
    
    
    public String listItems()
    {
        String output= "List :";
        for (int index=0; index <numElements; index++)
        {
            output+= " "+m_array[index];
        }
        return output;
    }
    
    public int linearSearch(int key)
    {
        for(int index=0;index < numElements; index++)
        {
            if(m_array[index]==key)
            {
                return index;
            }
        }
        return -1; //CAN NEVER OCCUR , FIINDING LOCATION
    }
    
    public boolean exists(int key)
    {
        return linearSearch(key)!=-1; //THIS COULD BE AN ACTULA NUMBER
    }
    
    public void selectionSort()
    {
                int smallestLoc,temp; //NEW

        // get starting points 
        for (int start=0; start < numElements-1; start++){
             smallestLoc= start;
            for(int index= start+1; index <numElements; index++)
            {
                if (m_array[index] < m_array[smallestLoc])
                {
                    smallestLoc=index;
                }
            }
            //swap
            temp= m_array[start];
            m_array[start]= m_array[smallestLoc];
            m_array[smallestLoc]= temp;
        }
    
    }
    
        public void insertionSort()
    {
        for(int start=1; start <numElements; start++)
        {
            int temp= m_array[start]; //copy starting value
            int pos= start-1;//get the item before
            while(pos >=0 && m_array[pos]>temp)
                    {
                        m_array[pos+1]= m_array[pos];
                        pos--;
                    }
                    m_array[pos+1]=temp;
         }
    
    }
    
    //NNNNEWWWW
//        public void mergeSort(){
//        mergeSortWorker(0,numElements-1);   
//    }
//    
//    private void mergeSortWorker(int lowerBound, int upperBound){
//        int mid;
//        if (lowerBound<upperBound){
//           mid = (lowerBound+upperBound) /2;
//           mergeSortWorker(lowerBound,mid) ;
//           mergeSortWorker(mid+1,upperBound);
//           merge(lowerBound,mid,upperBound);
//        }    
//    }
//    
//    private void merge (int low, int mid, int upper){
//        int i,j,k;
//        int[] temp = new int[upper - low +1];
//        i= low; k=0; j=mid+1;
//        while (i <= mid && j<=upper){
//            if (m_array[i]<m_array[j]){
//                temp[k] = m_array[i];
//                i++;
//            }else{
//                temp[k] = m_array[j];
//                j++;
//            }
//            k++;           
//        }
//        while (i<=mid){
//            temp[k]=m_array[i];
//            k++;i++;
//        }
//        while (j<=upper){
//            temp[k]=m_array[j];
//            k++;j++;
//        }    
//        // copy back
//        for (i=low;i<=upper;i++){
//            m_array[i]=temp[i-low];
//        }      
//    }
   
        public void mergeSort(){
        mergeSortWorker(0,numElements-1);   
    }
    
    private void mergeSortWorker(int lowerBound, int upperBound){
        int mid;
        if (lowerBound<upperBound){
           mid = (lowerBound+upperBound) /2;
           mergeSortWorker(lowerBound,mid) ;
           mergeSortWorker(mid+1,upperBound);
           merge(lowerBound,mid,upperBound);
        }    
    }
    
    private void merge (int low, int mid, int upper){
        int i,j,k;
        int[] temp = new int[upper - low +1];
        i= low; k=0; j=mid+1;
        while (i <= mid && j<=upper){
            if (m_array[i]<m_array[j]){
                temp[k] = m_array[i];
                i++;
            }else{
                temp[k] = m_array[j];
                j++;
            }
            k++;           
        }
        while (i<=mid){
            temp[k]=m_array[i];
            k++;i++;
        }
        while (j<=upper){
            temp[k]=m_array[j];
            k++;j++;
        }    
        // copy back
        for (i=low;i<=upper;i++){
            m_array[i]=temp[i-low];
        }      
    }    
        
    public void quickSort()
    {
        quickSortHelper(0,numElements-1);
    }
    
    public void quickSortHelper(int low, int high)
    {
        if(low<high)
        {
            int pivotPosition= partition(low,high);
            quickSortHelper(low,pivotPosition-1);
            quickSortHelper(pivotPosition+1,high);
                    
        }
    
    }
    
    public int partition(int low, int high)
    {
        int pivot= high;
        int left= low,right= high-1; 
        while(left<=right)
        {
        while(m_array[left] < m_array[pivot]) left++;
        while (right>=0 && m_array[right] > m_array[pivot])right--;
        if (left<=right)
        {
            int temp=m_array[left];
            m_array[left]= m_array[right]; //swapping
            m_array[right]= temp;
            left++;
            right--;

        }
    }
        
          int temp= m_array[left];
            m_array[left]= m_array[pivot]; //swapping
            m_array[pivot]= temp;
            return left; 
    }
    
    
}
