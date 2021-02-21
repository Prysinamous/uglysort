/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststructure;

/**
 *
 * @author Paolo
 */
public class UnorderedArray {
    
    private int numElements;
    private int maxSize;
    private int m_array[];
    
    public UnorderedArray(int maxSize){
        numElements = 0;
        this.maxSize = maxSize;
        m_array = new int[maxSize];
    }
    
    public boolean addLast(int item){
        if(numElements < maxSize){
            m_array[numElements] = item;
            numElements++;
            return true;
        }
        return false;
    }
    
      public boolean addInOrder(int key) {
        if (numElements < maxSize) {
            int pos = numElements - 1;
            while (pos >= 0 && m_array[pos] > key) {
                m_array[pos + 1] = m_array[pos];
                pos--;
            }
            m_array[pos + 1] = key;
            numElements++;
            return true;
        }
        return false;
    }
    
    public String listItems(){
       String s = "List: ";
       for(int i = 0; i < numElements; i++){
           s += m_array[i] + " ";
       }
        
       return s;         
    }
    
    public boolean removeLast(){
        if(numElements > 0){
            numElements--;
            return true;
        }
        return false;
    }
    
    public boolean removeByIndex(int index){
        if(index >= 0 && index < numElements){
            m_array[index] = m_array[numElements - 1];
            numElements--;
            return true;
        }
        return false;
    }
    
    public int linearSearch(int key){
        for(int i = 0; i < numElements; i++){
            if(m_array[i] == key){
                return i;
            }
        }
        
        return -1;
    }
    
    public Integer getItem(int key){
        int loc = linearSearch(key);
        if(loc != -1){
            return m_array[loc];
        }
        return null;
    }
    
    public void selectionSort(){
        int smallest;
        int temp;
        for(int i = 0; i < numElements; i++){
            smallest = i;
            for(int j = i+1; j < numElements; j++){
                if(m_array[j] < m_array[smallest]){
                    smallest = j;
                }
            }
            temp = m_array[i];
            m_array[i] = m_array[smallest];
            m_array[smallest] = temp;
            
            //For testing
            if(i < 5){
            System.out.print((i+1) + ": ");
            for(int test = 0; test < numElements; test++){
                System.out.print(m_array[test] + " ");
            }
            System.out.println("");
            }
        }
    }
    
    public void insertionSort(){
        int temp;
        int j;
        for(int i = 1; i < numElements; i++){
            temp = m_array[i];
            j = i-1;
          while(j >= 0 && m_array[j] > temp){
              m_array[j+1] = m_array[j];
              j--;
          }
          m_array[j+1] = temp;
          
          //For testing
           if(i < 6){
            System.out.print((i) + ") ");
            for(int test = 0; test < numElements; test++){
                System.out.print(m_array[test] + " ");
            }
            System.out.println("");
            }
        }
    }
    
      public int binarySearch(int key) {
        int lo = 0;
        int hi = numElements - 1;
        int mid = 0;

        while (lo <= hi) {
            mid = (lo + hi) / 2; //find the midpoint
            if (m_array[mid] == key) { //check if it's at midpoint
                System.out.println("Low: " + lo);
                System.out.println("Hi: " + hi);
                System.out.println("Mid: " + mid);
                return mid;
            }
            if (m_array[mid] > key) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println("Low: " + lo);
        System.out.println("Hi: " + hi);
        System.out.println("Mid: " + mid);
        return -1;
    }
    
    private void merge(int low, int mid, int high){
        mid = (high + low) / 2;
        int i = low;
        int j = mid +1;
        int k = 0;
        
        int[] temp = new int[(high - low) + 1];
        
        while(i <= mid && j <= high){
            if(m_array[i] < m_array[j]){
                temp[k] = m_array[i];
                i++;
            }
            else {
                temp[k] = m_array[j];
                j++;
            }
        }
        k++;
        
        while(i <= mid){
            temp[k] = m_array[i];
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = m_array[j];
            j++;
            k++;
        }
        
        for(i = low; i <= high; i++){
            m_array[i] = temp[i - low];
        }
    }
    
    private void mergeSortWorker(int low, int high){
        int mid;
        if(low < high){
            mid = (high + low) / 2;
            mergeSortWorker(low, mid);
            mergeSortWorker(mid+1, high);
            merge(low, mid, high);
        }
    }
   
    public void mergeSort(){
        mergeSortWorker(0, numElements - 1);
    }
    
   
    
   
    
   
}
