
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
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.insert(4,69);
        l.print();
        l.delete(4);
        System.out.println("----------");
        System.out.println("DELETED 4");
        System.out.println("----------");
        l.print();
        
    
    }
    
}
