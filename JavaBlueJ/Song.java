
import java.util.Scanner;

public class Song
{
    public String song;
    public String artist;
    public int length;//seconds
    
    Song()
    {
        
        length = (int)(Math.random()*((20-5)+1)+1);
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Input Name of Song: ");
        song = sc.nextLine();
        System.out.println("Input Artist of Song: ");
        artist = ac.nextLine();
    }
    
    public String nameSong(String s)
    {
        song = s;
        return song;
    }

    public String nameArtist(String a)
    {
        artist = a;
        return a;
    }

    public void playSong()
    {
        int x = 1;
        for(int i = 0; i < length; i++)
        {
            System.out.println("Song Playing: " + song);
            System.out.println("Artist: " + artist);
            System.out.println("Time: " + 1 + " seconds");
            x++;
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

    }

}
