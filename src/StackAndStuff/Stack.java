
package StackAndStuff;

/**
 *
 * @author avila-good-m
 * Description : make a list type called a stack where elements can only be
 * be put on and taken of the stack.
 * 
 * Input: should have integers to fill the stack, and one for determining 
 * size of stack
 * 
 * Output: None unless user asks for top element. This is a class not a main
 */
public class Stack {
    private int length;
    private int[] list;
    private int top;
    
// **************** constructor *******************
    public Stack(int l){
        length = l;// set length
        list = new int [length];// set list length
        top = 0;// set top element to 0
    }// end initialized constructor
    
//****************** accessors ****************
    public int peek(){// start peek
        return list[top];// return top element
    }// end peek at top element
//***************** Transformers *******************

    public void push(int in){
        
        if(top < length){// if not at top of list yet
        top++;// update top of stack
        list[top] = in;// set top of stack
        }//end if not at max lenght
        
        else// else if stack full
        System.out.println("Stack full");// tell user stack full
        
    }// end push an element on top
    
    public void pop(){
        System.out.println(list[top]+ "to be removed");
        list[top]= 0;// replace top value with 0
        
        if(top>0){// if top is not at bottom
        top--;// lower the top
        }// end if stack not empty
        
        else{// else at bottom already
        top = 0;// set top to first element of
        System.out.println("You've reached the bottom of the list");
        }// end else at bottom
        
    }// end pop an element off
    
}// end class
