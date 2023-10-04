import java.util.*;

public class Node<T>{
    private T data;
    private Node next;

    Node(T val)
    {
        this.data=val;
        this.next=null;
    }

    T getData(){
      return data;
    }

}
