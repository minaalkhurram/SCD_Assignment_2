import java.util.*;

public class Node<T>{
    private T data;
    public Node<T> next;

    Node()
    {
      this.data=null;
        this.next=null;
    }
    Node(T val)
    {
        this.data=val;
        this.next=null;
    }

    T getData(){
      return data;
    }

}
