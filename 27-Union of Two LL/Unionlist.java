import java.util.*;
 class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
        Node cur=null,start=null;
        
        TreeSet<Integer> s = new TreeSet<Integer>();        
        // using tree set to store numbers in sorted order
        
        while(head1!=null)
        {
            // adding all numbers in list1 to set
            s.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null)
        {
            // adding all numbers in list2 to set
            // duplicates will be ignored in set
            s.add(head2.data);
            head2=head2.next;
        }
        for(Integer i : s)
        { 
            Node ptr=new Node(i);
            if(start==null)
            {
                // creating new head
                start=ptr;
                cur=ptr;
            }
            else
            {
                // appending node at the end
                cur.next=ptr;
                cur=ptr;
            }
        }
        return start;
	}
}