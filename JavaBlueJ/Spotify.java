import java.util.LinkedList;
import java.util.Scanner;
public class Spotify
{
    public static void main (String [] args)
    {
        LinkList Playlist = new LinkList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.println("How many songs would you like to add?");
        int amt = sc.nextInt();
        for(int i = 0; i < amt; i++)
        {
            Playlist.add(new Song());
        }
        int size = Playlist.size();
        while(exit == false)
        {
            Scanner a = new Scanner(System.in);
            System.out.println("Playlist has been created. What would you like to do?");
            System.out.println("1: Play Playist");
            System.out.println("2: Print Playlist");
            System.out.println("3: Play Certain Song");
            System.out.println("4: Remove Song");
            System.out.println("5: Exit");
            System.out.println("Choice: ");
            String choice = a.nextLine();
            if(choice.equals("1"))
            {  
                //Scanner s = new Scanner(System.in);
                

            }
            else if(choice.equals("2"))
            {
                for(int i = 0; i <size; i++)
                {
                    System.out.print("Song: " + Playlist.getSong(i).song);
                    System.out.print("Artist: " + Playlist.getSong(i).artist);
                    System.out.print("Length in Seconds: " + Playlist.getSong(i).length);
                    System.out.println();
                }
            }
            else if(choice.equals("3"))
            {
                System.out.println();
                System.out.println("WIP");
                System.out.println();
            }
            else if(choice.equals("4"))
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("What song would you like to remove from your playlist?");
                String rem = scan.nextLine();
                if(Playlist.containsSong(rem))
                {
                    for(int i = 0; i < size; i++)
                    {
                        if(Playlist.getSong(i).song.equals(rem))
                        {
                            Song r = Playlist.getSong(i);
                            Playlist.delete(r);
                        }
                    }
                }
                else
                {
                    System.out.println(rem + " is not in this playlist.");
                }
            }
            else if(choice.equals("5"))
            {
                exit = true;
            }
            else
            {
                System.out.print("Invalid Choice, choose again.");
            }

        }
    }
}
