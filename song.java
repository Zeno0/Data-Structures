public class song implements Comparable<song>{ // class used as a type in Comparator, it must be implemented to Comparable
    String title,artist;  // instance variable used

    song(String t, String a){  // constructor
        title=t;
        artist =a;
    }

    public boolean equals(Object x){  // override the equals method 
        song s = (song)x;
        return getTitle().equals(s.getTitle());  // ask if a title is equal to another song's title

    }

    public int hashCode(){   //  returns hashcode of title
        return title.hashCode();
    }


    public int compareTo(song e){  // method to compare the title of song.
                                   // compareTo method is overrided to compare the title.
                                   // sort() method sends a song object to compare the title.
        return title.compareTo(e.getTitle());
    }

    public String getTitle(){  
        return title;

    }

    public String getArtist(){
        return artist;
    }
    public String toString(){
        return  title;
    }


}