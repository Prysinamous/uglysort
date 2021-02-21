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
public class TestStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        OrderedArray ol = new OrderedArray(10);
        UnorderedArray ul = new UnorderedArray(10);
        
        //System.out.println(raisePower(3, 3));
        /*ul.addLast(32);
        ul.addLast(8);
        ul.addLast(29);
        ul.addLast(-6);
        ul.addLast(17);
        ul.addLast(32);
        ul.addLast(3);
        ul.addLast(8);
        ul.addLast(5);
        ul.addLast(23);
        ul.insertionSort(); */
        
        ul.addInOrder(-6);
        ul.addInOrder(3);
        ul.addInOrder(5);
        ul.addInOrder(9);
        ul.addInOrder(9);
        ul.addInOrder(11);
        ul.addInOrder(17);
        ul.addInOrder(23);
        ul.addInOrder(29);
        ul.addInOrder(32);
        ul.binarySearch(-5);
    
    }
    
    static int collatz(int n){
        if(n == 1){
            return 0;
        }
        
        if(n % 2 == 0){
            return 1 + collatz(n/2);
        }
        
        else{
            return 1 + collatz((3 * n) + 1);
        }
    }
    
    static int raisePower(int num, int power){
        if(power == 1){
            return num;
        }
        
        return num * raisePower(num, power - 1);
        
        
    }
    
}
