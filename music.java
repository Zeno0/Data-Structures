import java.io.*;
import java.util.ArrayList;
public class music{
    
    ArrayList<String> songlist = new ArrayList<String>(); // list where songs will be saved
    
    // go() method to pront songlist
    void go(){
        getsongs(); // it gets the songs from txt file and adds them to Arraylist 
        System.out.println(songlist);
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
        songlist.add(token[0]); 
    }

 public static void main (String args[]){
     
     new music().go();
}

}

