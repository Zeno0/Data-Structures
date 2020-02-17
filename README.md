# Data-Structures
Basic data structures in java
 ## class song 
  It implements Comparable<song> with Instance variables title and artist.
  ### override equals(Object x) method
   It equates the title of songs.
  ### override hashcode() method
   It returns the hashCode of title.
  ### override compareTo(song e) method
   It compares the title of songs.
  ### override the toString() method 
   It returns the title. 
  ### getTitle() method 
   returns title.
  ### getArtist() method 
   returns artist.
  ## class music 
   It uses data structure ArrayList
  ### inner class artistcompare
    It implements Comparator and gets result by comparing the artist of song.
  ### getsongs() method
    It reades songs from a .txt file and invokes addsongs method.
  ### addsongs(String) method
    It adds song to the Arraylist.
  ### go() method
    It invokes getsongs method.
    It sorts the ArrayList.
    It tells about using HashSet. It prevents duplicacy in title of songs but doesnt prevents sort order. Therfore TreeSet is used. It can do everything.

# Source 
For music.java and song.java 
--- Head First Java By O'reilly---