/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author hryzx
 */
public class StackArray {
    int[] arr = new int[0];
    
    /*
    push
    pop
    peek
    isEmpty
    clear
    */
    
    public int push(int e) {
        int[] tArr = new int[arr.length+1];
        System.arraycopy(arr, 0, tArr, 0, arr.length);
        tArr[tArr.length-1] = e;
        arr = tArr;
        return e;
    }
    
    public int pop() {
        int[] tArr = new int[arr.length-1];
        System.arraycopy(arr, 0, tArr, 0, arr.length-1);
        arr = tArr;
        return arr[arr.length-1];
    }
    
    public int peek() {
        return arr[arr.length-1];
    }
    
    public boolean isEmpty() {
        return arr.length == 0;
    }
    
    public void clear() {
        arr = null;
    }
    
    public int[] print() {
        return arr;
    }
}
