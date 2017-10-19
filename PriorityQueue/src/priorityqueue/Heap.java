/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nabeel
 */
public class Heap {
    ArrayList<Node> arr=new ArrayList<>();
    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n,p);
        arr.add(newNode);
        
        sort();
    }
    
    void sort()
    {
        System.out.println("arr size: " + arr.size());
        int nonLeafNodeIndex = (int) floor( (arr.size()-1) / 2 );
        for(int i=arr.size(); i>=0;i--)
        {
            if(2*i+2 < arr.size()) //valid index | for right child
            {
                if( arr.get(i).priority >  arr.get(2*i+2).priority )
                {
                    //swap
                    Collections.swap(arr,i,2*i+2);
                }
            }
            
            if(2*i+1 < arr.size()) //valid index | for left child
            {
                if( arr.get(i).priority >  arr.get(2*i+1).priority )
                {
                    //swap
                    Collections.swap(arr,i,2*i+1);
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
    public void delete()
    {
        Collections.swap(arr,0,arr.size()-1); //swap root with last element
        
        arr.remove(arr.size()-1); 
        
        //sort from top
        for(int i=0 ;i<arr.size();i++)
        {
            
            if(2*i+1 < arr.size()) //valid index | for left child
            {
                if( arr.get(i).priority >  arr.get(2*i+1).priority )
                {
                    //swap
                    Collections.swap(arr,i,2*i+1);
                }
            }
            if(2*i+2 < arr.size()) //valid index | for right child
            {
                if( arr.get(i).priority >  arr.get(2*i+2).priority )
                {
                    //swap
                    Collections.swap(arr,i,2*i+2);
                }
            }
            
        }
        
    }
    
}
