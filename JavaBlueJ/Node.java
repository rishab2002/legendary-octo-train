
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{
   int data;
   Node next;
   
   Song song;
   
   
   Node(int x)
   {
       data = x;
       next = null;
   }
   Node(Song s)
   {
       song = s;
       next = null;
   }
}
