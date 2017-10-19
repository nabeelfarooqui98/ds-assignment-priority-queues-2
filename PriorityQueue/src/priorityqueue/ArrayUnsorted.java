/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import java.util.ArrayList;

/**
 *
 * @author Nabeel
 */
public class ArrayUnsorted {
    ArrayList<Node> arr=new ArrayList<>();
    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n,p);
        arr.add(newNode);
    }
    public void delete()
    {
        int minIndex = 0;
        if(arr.size()==0)
            return;
        
        for(int i=0;i<arr.size();i++)
        {
            if( arr.get(i).priority < arr.get(minIndex).priority )
            {
                minIndex = i;
            }
        }
        
        arr.remove(minIndex);
    }
    void print(){
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i).name + " " + arr.get(i).priority);
        }
    }    
}
