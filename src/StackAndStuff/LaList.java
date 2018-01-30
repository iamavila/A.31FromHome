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
//******************** constructors ****************
    
    public LaList(){
        curr = new Node();
        head = curr;
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
    
    public void getData(int in){
        curr = head;
        int count = 0;
        for(int i = 0; i <in; i++){
            curr= curr.next;

            count++;
        }
        System.out.println("node: " + count + " = " + curr.getData());// get data
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
    
    public void addNode(Object in){
        Node addNew = new Node(in);
        curr.next = addNew;
        curr = curr.next;
    }
    
    public void insertNode(int in){
        Node insNew = new Node();
        Node
        curr = head;
        for(int i = 0; i <in; i++){
            curr= curr.next;
        }// for get to proper location
        curr = insNew;// inserts after the chosen node
        insNew.next = curr.next.next;// reattach rest of list
        // i think this should still work for putting at front of list ?
    }// end insert node at chose location
    
    
    
    public void delNode(int n){
        Node dele;
        curr = head;
        
        /*
        set at 1, so that the "if" section will still work for the first node 
        after head. The "else" is specific to trying to delete head
        */      
        for(int i = 1; i<n; i++){
            curr = curr.next;
            System.out.println(curr.getData());
        }// find node to be deleted

        System.out.println("ishead = " + n);
        
        if(n >=1){
        System.out.println(curr.getData() + " curr");
        dele = curr.next;
        curr.next = curr.next.next;
        dele = null;// i have no clue if this will work\
        }
        
        
        else{
            dele = curr;// set node to be deleted to current node

            curr = curr.next;//set current to next node
            dele = null;// delete what was current node. i have no clue if this will work
            head = curr;// reset head to current. otherwise the "first 
        }
        
        // it works!!1
    }//end delete node 
    
    
    

    
    
    
}
