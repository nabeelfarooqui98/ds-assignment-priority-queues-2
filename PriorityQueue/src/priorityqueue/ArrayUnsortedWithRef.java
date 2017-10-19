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
public class ArrayUnsortedWithRef {
    ArrayList<Node> arr=new ArrayList<>();
    int minIndex;
    
    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n,p);
        arr.add(newNode);
        if(arr.size() == 1)
        {
            minIndex = 0;
        }
        else
        {
            if(p < arr.get(minIndex).priority)
            {
                minIndex = p;
            }
        }
    }
    public void delete()
    {
        if(arr.size()==0)
            return;
        
        arr.remove(minIndex);
    }
    void print(){
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i).name + " " + arr.get(i).priority);
        }
    }    
}
