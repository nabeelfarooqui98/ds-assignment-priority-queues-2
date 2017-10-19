/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author k163627
 */
public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(String nam, int pri) {
        Node newNode = new Node(nam, pri);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        if (pri < temp.priority) {
            newNode.next = head;
            head = newNode;
            
        } else if (pri > temp.priority) {
            
            while (true) {
                if (pri > temp.next.priority) {
                    temp = temp.next;
                } else if (pri < temp.next.priority) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                else if (pri == temp.priority) {
            while (true) {
                if (pri == temp.next.priority) {
                    temp = temp.next;
                } else if (pri != temp.next.priority) {
                    temp.next = newNode.next;
                    temp.next = newNode;
                    break;
                }
            }
        }
            }
            
            
        } else if (pri == temp.priority) {
            while (true) {
                if (pri == temp.next.priority) {
                    temp = temp.next;
                } else if (pri != temp.next.priority) {
                    temp.next = newNode.next;
                    temp.next = newNode;
                    break;
                }
            }
        }
    }

    public void print() {
        Node temp=head;
        if(head== null){
            return;
        }
        while(temp != null){
            System.out.println(temp.name+" "+temp.priority);
            temp=temp.next;
            
        }

    }

}
