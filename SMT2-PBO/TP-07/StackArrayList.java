/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

import java.util.ArrayList;

/**
 *
 * @author hryzx
 */
public class StackArrayList {
    ArrayList<Integer> arr = new ArrayList<>();
    
    /*
    push
    pop
    peek
    isEmpty
    clear
    */
    
    public int push(int e) {
        arr.add(e);
        return e;
    }
    
    public int pop() {
        arr.remove(arr.size()-1);
        return arr.get(arr.size()-1);
    }
    
    public int peek() {
        return arr.get(arr.size()-1);
    }
    
    public boolean isEmpty() {
        return arr.isEmpty();
    }
    
    public void clear() {
        arr.clear();
    }
    
    public ArrayList print() {
        return arr;
    }
}
