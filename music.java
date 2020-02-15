import java.io.*;
import java.util.*;
public class music{
    
    ArrayList<song> songlist = new ArrayList<song>(); // list where songs will be saved
    ArrayList<song> artistlist = new ArrayList<song>();

    class artistcompare implements Comparator<song>{  // artistcompare class implements Comparator and
                                                      // overrrides the compare method.
        public int  compare(song x, song y){
            return x.getArtist().compareTo(y.getArtist()); // compare the artist of each song
        }
    }
    // go() method to pront songlist
    void go(){
        getsongs(); // it gets the songs from txt file and adds them to Arraylist.
        System.out.println("Initial songlist");
        System.out.println(songlist);   // print the songlist
        Collections.sort(songlist);    // sorts the songlist, while songlist takes the song as an object
        System.out.println("songlist after sorting by title :/ ");
        System.out.println(songlist);  // prints the sored songlist
        artistcompare ac = new artistcompare(); // custom Comparator object
        System.out.println("songlist after sorting by artist :/ ");
        Collections.sort(songlist,ac);   // sorts the songlist by artist
        System.out.println(songlist); // prints sorted songlist
        songlist.sort(ac);  // another way to invoke custom Comparator
        //System.out.println(songlist);
        HashSet<song> songset = new HashSet<song>();   // initialize a HashSet
        Collections.sort(songlist);
        songset.addAll(songlist);  // List can be added in a Set. 'songset' is modified such that, no duplicates are allowed
        System.out.println("songset is printed now :/ ");
        System.out.println(songset);  // here the problem is 'songset' is not sorted.
        // to make it stay sorted use TreeSet
        TreeSet<song> songtreeset = new TreeSet<song>();
        songtreeset.addAll(songlist);
        System.out.println("songtreeset is printed now :/ ");
        System.out.println(songtreeset);



        


    }
    
    void getsongs(){
        try{
        File f = new File("songlist.txt"); // get file
        BufferedReader br = new BufferedReader(new FileReader(f)); // wraps the file object with the FileReader and BufferedReader
        String l = null;
        while((l=br.readLine())!= null){
            addsongs(l); // add songs to Array List
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        }
    
    void addsongs(String x){
        String token[] = x.split("/");  // split the line and adds only songs
        song s = new song(token[0],token[1]);  // add title and artist in song object
        songlist.add(s); // add song object in 'songlist'.

        
    
    }

   // main
 public static void main (String args[]){
     
     new music().go();
    
}

}

