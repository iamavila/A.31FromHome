package A3part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avila-good-m
 */
public class A3p2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        String strin;
        String split;
        BufferedReader fin = new BufferedReader(new FileReader("bracketData.txt"));
        
        strin = fin.readLine();
        BracketStack pbs = new BracketStack(strin);
        
        while(strin != null){
            for(int i = 0; i <strin.length(); i++){
                char f = strin.charAt(i);
                System.out.print(f);
            }
            System.out.println("");
            
            strin = fin.readLine();
        }
        
        int i = 0;
        char bB;
        while(i < strin.length()){
            bB = strin.charAt(i);
            if(pbs.TheS.isEmpty() == true|| Compare(pbs, bB) == true){
                pbs.push(bB);
            }
        }

        
        
        
    }
    
    public static boolean Opener(char in){
        boolean open = false;
        
        switch (in){
            case '[':
            case '{':
            case '(':
            case '<':{
                open = true;
                break;
            }
        }
        
        return open;
    }
    
    public static boolean Compare(BracketStack pb, char in){
        boolean goodly = false;
        char first = pb.pop();
        
        switch(in){
            case ']':
                in = '[';
            case '}':
                in = '{';
            case ')':
                in = '(';
            case '>':
                in = '<';
        }   
            if(first == in)
            goodly = true;
            else
                pb.push(first);
        
        return goodly;
    }
    
}
