/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author k163628
 */
public class PriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArraySortedDescending obj = new ArraySortedDescending();
        Heap obj = new Heap();
        //LinkedListUnsorted obj = new LinkedListUnsorted();
        //LinkedList obj =new LinkedList();
        obj.insert("Muaaz",2);
        obj.insert("Nabeel", 1);
        obj.insert("Ubaid", 1);
        obj.insert("Pasa", 90);
        obj.insert("Hamza", 3);
        obj.insert("Suleman", 4);
        obj.insert("Umair", 3);
        obj.insert("Pasa", 1);
        obj.insert("abc", 2);
        obj.insert("def", 2);
        
        
      
        obj.print();
        obj.delete();
        System.out.println("");
        obj.print();
         obj.delete();
        System.out.println("");       
        obj.print();
         obj.delete();
        System.out.println("");        
        obj.print();
         obj.delete();
        System.out.println("");        
        obj.print();
         obj.delete();
        System.out.println("");        
        
    }
    
}
