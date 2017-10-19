/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueue;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author K163628
 */
public class ArraySortedDescending {
    ArrayList<Node> arr=new ArrayList<>(); 

    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n, p);
        arr.add(newNode);
    
        
        sort();
        
    }
    void sort(){
         
        int n = arr.size();
        Node temp = null;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr.get(j-1).priority < arr.get(j).priority){  
                                 //swap elements  
//                                 temp = arr.get(j-1);  
//                                 arr.get(j-1) = arr[j];  
//                                 arr[j] = temp;
                              Collections.swap(arr,j,j-1);
                         }  
                          
                 }  
         }  
    }
    void print(){
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i).name + " " + arr.get(i).priority);
        }
    }
    void delete(){
        int x=arr.get(arr.size()-1).priority;
        
        for (int i = 0; i < arr.size(); i++) {
            
            if(arr.get(i).priority == x)
            {
                arr.remove(i);
                break;
            }
            
        }
        
    }
    
    
    
    
}
