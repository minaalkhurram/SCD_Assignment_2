import java.util.*;

public class GenericStack<T> {
private Node<T> head;

public void push(T val)
{
    Node<T> nn=new Node(val);
    if(head==null)
    {
        head=nn;
    }
    else
    {
    nn.next=head;
    head=nn;}

}

public Node<T> pop()
{
    try
    {
        if(head==null)
        {
            System.out.println(0);
            throw new EmptyStackException();
        }
        else
        {
            System.out.println("Pop element data : "+head.getData());
            Node<T> nn=head;
            head=head.next;
            return nn;

        }
    }
    catch (EmptyStackException e)
    {
       System.out.println("Exception : "+e);
    }
    return null;
}

public void print()
{
    Node<T> nn=head;
    while(nn!=null)
    {
        System.out.println(nn.getData());
        nn=nn.next;

    }
}

public boolean isEmpty()
{
    if(head==null)
    return true;
    else 
    return false;
}
public int size()
{
    if(this.isEmpty()==false)
    {
        Node<T> temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    return 0;
}

}
