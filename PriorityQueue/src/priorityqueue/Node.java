/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author k163643
 */
public class Node {
    String name;
    
    int priority;
    Node next;

    Node(String na, int p) {
    
        name = na;
        priority = p;
        next = null;
    }
    
}
