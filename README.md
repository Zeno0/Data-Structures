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
  ## class stack
   It implements a basic stack with the help of an Array. It has Two options. First, in which a String is entered by user and second, where full stack is used by the user. It contains two Constructors. 
  ### push(char) method
   it pushes the vlaue in stack.
  ### pop() method
   It pops the value in stack.
  ### isempty() method
   It returns true if the stack is empty.
  ### isfull() method
   It returns true if the stack is full.
  ### peekn(int) method
   It returns the data at the asked index.
  ### size() method
   It returns the number of elements in stack.
  ### display() method
   It prints the data in stack.


# Source 
For music.java and song.java 
--- Head First Java By O'reilly---