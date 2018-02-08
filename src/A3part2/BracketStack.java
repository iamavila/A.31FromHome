/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3part2;

import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 */
public class BracketStack {
        private int top;
        ArrayList<Character> TheS;
        private String hold;
    
// **************** constructor *******************
    public BracketStack(String in){
        top = 0;// set top element to 0
        TheS = new ArrayList<Character>();
        hold = in;
        
    }// end initialized constructor
    
//****************** accessors ****************
    public Object peek(){// start peek
        System.out.println(TheS.get(top-1));
        return TheS.get(top-1);// return top element
        
    }// end peek at top element
    
    public void isEmpty(){
        System.out.println("Empty: " + TheS.isEmpty());
    }// end check if empty
    
    
//***************** Transformers *******************

    public void push(char in){
        
        
        System.out.println("top = " + top);
        TheS.add(top, in);// set top of stack
        top++;
        
        
    }// end push an element on top
    
    public char pop(){
        System.out.println("Spot " + (top-1) + " of value " + TheS.get(top-1) + " to be removed");
        TheS.remove(TheS.get(top-1));//delete top index
        
        top--; // lower the top of stack
        
        return TheS.get(top-1);
    }// end pop an element off\
    

    

    
    
}// end class
