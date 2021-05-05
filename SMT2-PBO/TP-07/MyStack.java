/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

import java.util.Stack;

/**
 *
 * @author hryzx
 */
public class MyStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        
        StackArrayList sal = new StackArrayList();
        sal.push(1);
        sal.push(2);
        sal.push(3);
        sal.pop();
        System.out.println(sal.peek());
        System.out.println(sal.print());
        
        StackArray sa = new StackArray();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.pop();
        System.out.println(sal.peek());
        for (int i = 0; i < sa.print().length; i++) {
            System.out.print(sa.print()[i]);
        }
    }
    
}
