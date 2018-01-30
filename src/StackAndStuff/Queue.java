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
        back = 0;// acts as the location where things will be added onto back
        front = 0;// always the very front of the line/that object's index
        TheQ = new ArrayList<Object>();// new array list
    }// end create queue
    
//*************************** Accessors ***********************
    public void CheckFirst(){
        System.out.println("Front: " + TheQ.get(front));
    }// end check the front of queue
    
    public void CheckLast(){
        System.out.println("Back: "  + TheQ.get(back-1));
    }// end check back of queue
    

    public void isEmpty(){
        System.out.println("Empty: " + TheQ.isEmpty());
    }// end check if empty
    
//*************************** Transformers ************************
    public void AddToBack(Object in){
        TheQ.add(back, in);// add object to back of line
        back++;// increase back 
 
    }// end addtoBack
    
    public void TakeOffFront(){
        TheQ.remove(front);// take off object at front of line
        back--;// reduce size
    };// end takeOffFront   
    
}// end class
