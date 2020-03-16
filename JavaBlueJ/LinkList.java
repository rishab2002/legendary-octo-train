
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

    int size()//WIP
    {
        if(start != null)
        {
            Node scanner = start;
            int size = 0;
            Node x = start.next;
            do
            {
                scanner = x.next;
                x = scanner.next;
                size++;

            }
            while(x != null);

            return size;
        }
        else
        {
            return 1;
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
                x.next = scanner.next;
                System.out.println();
                System.out.println("FOUND DATA");

                found = true;
            }
            if(scanner == null)
            {
                found = true;
                System.out.println("Not in Link List");
            }

            x = scanner;
            scanner = scanner.next;

        }
        while(found == false);
    }

    void insert(int index , int data)
    {
        if(index > size())
        {
            System.out.println("Index Too High, Just added too List");
            System.out.println("Size: " + size()); 
            add(data);
        }
        else if(index < 0)
        {
            System.out.println("Index Less than 0, Just added too List");

            add(data); 
        }
        else if(index == 0)
        {
            start = new Node(data);
        }
        else{
            Node i = new Node(data);
            Node scanner = start;
            boolean found = false;
            Node x = start.next;
            int count = 1;
            do
            {

                if(count == index)
                {
                    Node y = scanner;
                    x.next = i;
                    i.next = y;
                    found = true;
                    System.out.println("INSERTED");

                }
                if(scanner == null)
                {
                    System.out.println("Index out of bounds");
                    found = true;
                    System.out.println("Not added to LinkList");
                }

                x = scanner;
                scanner = scanner.next;

                count++;

            }
            while(found == false);
        }

    }

    
    boolean containsSong(String s)
    {
        
        Node scanner = start;
        boolean found = false;
        Node x = start.next;
        
        do
        {

            if(scanner.song.equals(s))
            {
                found = true;
                return true;

            }
            

            x = scanner;
            scanner = scanner.next;

            

        }
        while(found == false);

        
        
        
        
        return false;

    }

    void add(Song s)
    {
        Node c = new Node(s);

        c.next = start;

        start = c;

    }

    Song getSong(int index)
    {

         Node scanner = start;
        boolean found = false;
        Node x = start.next;
        int count = 1;
        do
        {

            if(count == index)
            {
                return scanner.song;

            }
            if(scanner == null)
            {
                System.out.println("Index out of bounds");
                found = true;

            }

            x = scanner;
            scanner = scanner.next;

            count++;

        }
        while(found == false);

        return null;

    }

    void printSongs()
    {
        Node current = start;
        while(current != null)
        {
            System.out.println("Song " + current.song);
            current = current.next;
        }
    }
    
    void playSongs()
    {
        Node current = start;
        while(current != null)
        {
            System.out.println("Song " + current.song + " Artist " + current.artist);
            current = current.next;
        }
    }

    void delete(Song s)
    {
        Node scanner = start;
        boolean found = false;
        Node x = start.next; //initialized with some random thing
        do
        {
            if(scanner.song == s)
            {
                x.next = scanner.next;
                System.out.println();
                System.out.println("FOUND DATA");

                found = true;
            }
            if(scanner == null)
            {
                found = true;
                System.out.println("Not in Link List");
            }

            x = scanner;
            scanner = scanner.next;

        }
        while(found == false);
    }

    void insert(int index , Song s)
    {
        Node i = new Node(s);
        Node scanner = start;
        boolean found = false;
        Node x = start.next;
        int count = 1;
        do
        {
            if(count == index)
            {
                Node y = scanner;
                x.next = i;
                i.next = y;
                found = true;
                System.out.println("INSERTED");

            }
            if(scanner == null)
            {
                System.out.println("Index out of bounds");
                found = true;
                System.out.println("Not added to LinkList");
            }

            x = scanner;
            scanner = scanner.next;

            count++;
        }
        while(found == false);

    }
}
 