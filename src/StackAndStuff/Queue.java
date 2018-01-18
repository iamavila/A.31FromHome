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
    private int[] list;
    private int length;
    private int back;
    private int front;
    Queue[] QueueList = new Queue[];
    
//************************** Constructor *****************************
    
    public Queue(){
        Queue
        back = 0;
        front = 0;
    }// end create queue
    
//*************************** Accessors ***********************
    public int CheckFirst(){
        return list[front];
    }// end check the front of queue
    
    public int CheckLast(){
        return list[back];
    }// end check back of queue
//*************************** Transformers ************************
    
}// end class
