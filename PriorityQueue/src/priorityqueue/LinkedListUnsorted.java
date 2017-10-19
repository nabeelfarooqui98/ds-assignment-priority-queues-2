/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Nabeel
 */
public class LinkedListUnsorted {
    Node head;
    int minIndex;
    
    public void insert(String n, int p)
    {
        Node newNode = new Node(n,p);
        if(head==null)
        {
            head = newNode;
            minIndex = 0;
            return;
        }
        
        Node temp = head;
        //int insertingAt=1;
        while(temp.next != null)
        {
            //insertingAt++;
            temp = temp.next;
        }
        
        temp.next = newNode;
        
    }

    public void delete()
    {

        if(head==null)
            return;

        Node temp = head;        
        Node min = head;
        
        while(temp!=null)
        {
            if(temp.priority < min.priority)
            {
                min = temp;
            }
            temp = temp.next;
        }
        
        //time to delete min
        if(min==head)
        {
            head = head.next;
        }
        else
        {
            Node premin = head;
            while(premin.next != min)
            {
                premin = premin.next;
            }
            premin.next = min.next;
        }
        
    }
            
    public void print() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.println(temp.name + " " + temp.priority);
            temp = temp.next;

        }

    }
    
}
