/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndStuff;

/**
 *
 * @author avila-good-m
 */
public class Node {
    
    protected Node next = null;
    private Object data;
    
    //*********************** constructor ******************
    
    protected Node(){
        data = 0;
        System.out.println("node created");
    }
    
    protected Node(Object in){
        data = in;
        System.out.println("node created");
    }// end init const
    
    //********************* accessors ***************************
    
    protected Object getData(){
        return data;
    }// end get Data
    
    //**************************** transformers ****************************
    
    
    
}
