import java.util.Scanner;

public class binarysearch {
   // Instance Variables
    int  arr[];   
    int size;
   
    // Countructor
    public binarysearch(int s){
             
               size =s;          //variables initialized 
              
               arr = new int[size];
    }
    //search method
    public int search(int x){
        int start=0;                   // start,end and mid of the array initialized
        int end=arr.length-1;
        int mid = (start+end)/2;
            
    
         while(true){
            
            
      
            if(x<arr[mid]){  
                end=mid-1;      // end and mid adjusted according to the position of the target
                mid = (start+ end)/2;
            }
            if(x>arr[mid]){
                start=mid+1;    // start and mid adjusted according to the position of the target
                mid = (start+ end)/2;
            }
            if(arr[mid]==x){    // target found
                break;
            }
            else{
                System.out.println("404 Not Found!");  // if target does'nt exist
               
                return 0;
            }
            

}
// System.out.println((mid+1)); 
  return mid+1;
    }
     //sort method
    public void sort(){                              
        int in,out;
        for(out=1;out<=arr.length-1;out++){            //it begins with 1st index
            int temp = arr[out];                       // temp contains data at 1st index
            in=out;
            while(in>0&&arr[in-1]>=temp){              //if condition satisfied then swap with one before the already taken data
                arr[in]=arr[in-1];
                arr[in-1]=temp;
                in--;                                // to terminate loop
            }
            
        }
       
    }
    public static void main(String[] args){
        int target=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = scan.nextInt();
      binarysearch bs = new binarysearch(x);
      System.out.println("Enter the elements of array:");
      for(int i=0;i<x;i++){
          bs.arr[i] = scan.nextInt();
      }
      bs.sort();     // sorted because binary search wokrs on sorted array
      System.out.println("What do you want to find from array?");
      target = scan.nextInt();
      if(bs.search(target)!=0){
         System.out.println(target+" is found at "+bs.search(target)+" place of array."); 
      }
         scan.close();
    }
}
