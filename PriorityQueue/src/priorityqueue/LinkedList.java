package priorityqueue;

/**
 *
 * @author k163628
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
                if (temp.next != null) {

                    if (pri > temp.next.priority) {
                        temp = temp.next;
                    } else if (pri < temp.next.priority) {
                        newNode.next = temp.next;
                        temp.next = newNode;
                        break;
                    }
                    else if (pri == temp.next.priority) {
                        
                        temp=temp.next;

                        while (true) {
                            if (temp.next != null) {
                                if (pri == temp.next.priority) {
                                    temp = temp.next;
                                } else if (pri != temp.next.priority) {
                                    newNode.next = temp.next;
                                    temp.next = newNode;
                                    break;
                                }
                            } else {
                                newNode.next = temp.next;
                                temp.next = newNode;
                                break;
                            }
                        }break;
                        

                    }

                } else {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
            }

        } else if (pri == temp.priority) {

            while (true) {
                if (temp.next != null) {
                    if (pri == temp.next.priority) {
                        temp = temp.next;
                    } else if (pri != temp.next.priority) {
                        newNode.next = temp.next;
                        temp.next = newNode;
                        break;
                    }
                } else {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
            }

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
