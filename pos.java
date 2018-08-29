import java.util.ArrayList; 

import java.util.Collections;   

public class SortArrayListAscendingDescending {

  private ArrayList<String> arrayList;       

        

  public ArrayList<String> getArrayList() {         

    return this.arrayList;     

  }       

  public ArrayList<String> sortAscending() {         

    Collections.sort(this.arrayList);         

    return this.arrayList;     

  }       
 public void add(Node newNode, Node head)
    {
        if(head == null) 
        {
            head = new Node(); 
            head = newNode;              
        }
        
    }
 static void insert(Node temp, int key)

 {

 Queue<Node> q = new LinkedList<Node>();

 q.add(temp);

 // Do level order traversal until we find

 // an empty place. 

 while (!q.isEmpty()) {

 temp = q.peek();

 q.remove();

 if (temp.left == null) {

 temp.left = new Node(key);

 break;

 } else

 q.add(temp.left);

 if (temp.right == null) {

 temp.right = new Node(key);

 break;

 } else

 q.add(temp.right);

 }

 }


}
