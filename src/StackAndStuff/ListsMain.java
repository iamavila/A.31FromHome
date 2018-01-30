/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndStuff;

import javax.swing.JOptionPane;

/**
 *
 * @author avila-good-m
 */
public class ListsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // No arraylists required here
//        
//        Queue NewQ = new Queue();
//        NewQ.isEmpty();
//        
//        NewQ.AddToBack(6);
//
//        
//        NewQ.AddToBack(7);
//
//        
//        NewQ.AddToBack("hello");
//
//
//        NewQ.TakeOffFront();
//        NewQ.CheckFirst();
//        NewQ.CheckLast();
//        
//        
//        NewQ.isEmpty();

        
//        Stack newStack = new Stack();
//        newStack.isEmpty();
//        newStack.push(5);
//        newStack.isEmpty();
//        newStack.peek();
//        newStack.push(18);
//        newStack.peek();
//        newStack.pop();
//        newStack.peek();
        
        
        LaList NewLL = new LaList();
        NewLL.addNode("no.1");
        NewLL.addNode(5);
        NewLL.addNode("third");
        
        NewLL.getData(0);
        NewLL.getData(1);
        NewLL.getData(2);
        NewLL.getData(3);

        System.out.println("\n");
        NewLL.delNode(3);
        NewLL.getData(0);
        NewLL.getData(1);
        NewLL.getData(2);
        
        //NewLL.insertNode(1);
        //NewLL.getData(3);
    }//end main
    
}// end class
