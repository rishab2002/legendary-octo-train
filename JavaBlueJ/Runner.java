
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main (String [] args)
    {
        System.out.println(" ");
        LinkList l = new LinkList();
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(123);
        l.print();
        l.delete(6);
        System.out.println("----------");
        System.out.println("DELETED 6");
        System.out.println("----------");
        l.print();
        
    
    }
    
}
