
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


//
//        ArrayList<XXXX> songs = new ArrayList<>();
//        for (int i = 0; i< 3;i++){
//            String artist = "Prince";//modify program to prompt user for an artist
//            String title = "Purple Rain"; //modify program to prompt user for a title
//            XXXX s = new Song();
//            s.setArtist(artist);
//            s.setTitle(title);
//            songs.add(s);
//        }
//
//        //print all the songs in the array list
//        for(Song xxxx: songs){
//            System.out.println(xxxx.display());
//        }
//
//        //look for blue and print if found
//        String titleToFind = "Purple Rain";
//        for (XXXX xxxx: xxxx){
//            if (xxxx.getTitle().equals(titleToFind)){
//                System.out.printf("I found %s \r\n",song.display());
//            }
//        }
//    }
//}


        ArrayList<Song> songs = new ArrayList<>();
        Scanner keybd = new Scanner(System.in);

        for (int i = 0; i< 3;i++){
            System.out.println("Enter an artist name: ");
            String artist = keybd.nextLine();//modify program to prompt user for an artist
            System.out.println("Enter a song name: ");
            String title = keybd.nextLine(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song xxx: songs){
            System.out.println(xxx.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song s: songs){
            if (s.getTitle().equals(titleToFind)){
                System.out.println();
                System.out.printf("I found %s \r\n", s.display());
            }
        }
    }
}






