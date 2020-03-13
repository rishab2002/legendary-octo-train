
/**
 * Write a description of class LinkList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkList
{
    Node start;
    
    
    void add(int data)
    {
        Node c = new Node(data);
        
        c.next = start;
        
        start = c;
        
    }
    
    void print()
    {
        Node current = start;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    void delete(int data)
    {
        Node scanner = start;
        boolean found = false;
        Node x = start.next; //initialized with some random thing
        do
        {
            if(scanner.data == data)
            {
                start = scanner.next;
                System.out.println();
                System.out.println("FOUND DATA");
                
                
                found = true;
            }
            
            x = scanner;
            scanner = scanner.next;
            x.next = scanner.next;
        }
        while(found == false);
    }
}
