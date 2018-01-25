/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndStuff;

import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 */
public class Queue {
    private int back; //refers to the element at the end of the list
    private int front;//same but for front
    ArrayList<Object> TheQ;
    
//************************** Constructor *****************************
    
    public Queue(){
        back = 0;
        front = 0;
        TheQ = new ArrayList<Object>();
    }// end create queue
    
//*************************** Accessors ***********************
    public Object CheckFirst(){
        System.out.println(front);
        return TheQ.get(front);
    }// end check the front of queue
    
    public Object CheckLast(){
        System.out.println(back);
        return TheQ.get(back);
    }// end check back of queue
    
    public void isEmpty(){
        System.out.println("Empty: " + TheQ.isEmpty());
    }// end check if empty
    
//*************************** Transformers ************************
    public void AddToBack(Object in){
        TheQ.add(back, in);
        back++;// increase back
 
    }// end addtoBack
    
    public void TakeOffFront(){
        TheQ.remove(front);
        front++;
    };// end takeOffFront   
    
}// end class
