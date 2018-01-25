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
public class LaList {
    
    private Node head;
    private Node curr;
//******************** constructors *****************
    public LaList(){
        head = new Node();
        curr = head;
    }//end default constructor
    
    
// ****************** accessors ************************
    public boolean isEmpty(){
        boolean emp = true;
        if(head.next!= null)
            emp = false;
        return emp;
    }// end check if empty
    
    public void traverse(){
        curr = head;
        
        do{/* do while so we can get data before going on don't want to end 
prematurely or get error for getting data of node that doesn't exist. 
we know head must exist and have data (or at least null)*/
            
            curr.getData();// get data
            curr = curr.next;// get next current
        }while((curr.next != null));// until no more nodes after next.
    }// end traverse
    
    public Object getData(Node chosen){
        return chosen.getData();// get data
    }// end getData
    
    public Object search(Object key){
        curr = head;// reset current
        while(curr.getData() != key){// verify key
            curr = curr.next;// update node
        }// end verify key
        return curr;//return curr.kinda unsure.untested(like everything else)
    }
        
// ************************* transformers *************************
    public void addNode(){
        Node addNew = new Node(); // create new node. It points to nowhere
        curr.next = addNew;// the previous node now points to new node
        curr = curr.next;// update the current to be new node.
    }// end addNode
    
    public void insertNode(int in){
        Node insNew = new Node();
        curr = head;
        for(int i = 0; i <in; i++){
            curr= curr.next;
        }// for get to proper location
        curr.next = insNew;// inserts after the chosen node
        insNew.next = curr.next.next;// reattach rest of list
        // i think this should still work for putting at front of list ?
    }// end insert node at chose location
    
    public void delNode(int n){
        Node dele;
        for(int i = 0; i<n; i++){
            curr = curr.next;
        }// find node to be deleted
        
        dele = curr.next;
        curr.next = curr.next.next;
        dele = null;// i have no clue if this will work
    }//end delete node 
    
    
    

    
    
    
}
