package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortedAscending 
{
    ArrayList<Node> arr=new ArrayList<>(); 
    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n, p);
        arr.add(newNode);
        sortAsc();
        
    }
    
    void sortAsc()
    {
        int n = arr.size();
        Node temp = null;  
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(arr.get(j-1).priority > arr.get(j).priority)
                {
                   Collections.swap(arr,j,j-1);
                }  
            }  
        }  
    }
    
    void print()
    {
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            System.out.println(arr.get(i).name + " " + arr.get(i).priority);
        }
    }
    
    void delete()
    {
        arr.remove(0);
    }
}
