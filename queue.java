import java.util.Scanner;

public class queue {
    static int max;
    long[] arr;
    int front;
    int rear;
  int n;
    // Constructor
    public queue(int j){
        max=j; 
        arr = new long[max];
        front =0;
        rear = -1;
       n=-1;
        
    }
    //Constructor
    public queue(){
        max=0; 
        arr = new long[max];
        front =0;
        rear = -1;
        n=-1;
    }
    // insert method
    public void insert(long j){
        
      
        arr[++rear]=j;
        System.out.println("you inserted: "+j);
       
        n++;
    }
    // remove method
    public long remove(){
        long temp = arr[front++]; // create a temp variable to get front data from queue
       
      n--;
        return temp;
    }
    // peek method
    public long peekn(int x){
        long f = arr[x]; // store data at the 'x' index of queue
     
        return f;
    } 
   
    // isempty method
    public boolean isempty(){
        return (max == 0);
    }
    public boolean isfull(){
        return (rear==max-1);
    }
    public void display(String x){
        System.out.println(x+"(Bottom to Top):");
      for(int i=front;i<=max-1;i++){
          System.out.print(peekn(i)+"/");
      }
        System.out.println("");
       
    }
    // main method
    public static void main (String[] args){
        boolean flag = true;
        int size=0;
        queue q = new queue();
        Scanner scan= new Scanner(System.in);
        while(flag){  // 2nd while
            int x=0;
            // optioms
            System.out.println("Enter any options ");
            System.out.println("1: to set the size of queue ");
            System.out.println("2: for insert ");
            System.out.println("3: for remove ");
            System.out.println("4: for peek at any index of queue ");
            System.out.println("5: for display");
            System.out.println("6: to go back ");
            
             x = scan.nextInt();
           
            switch(x){
                case 1 :   
                 size= scan.nextInt();
                 q = new queue(size);
                 break;

                case 2 :
                System.out.println("Enter the integer you want to enter ");
                Long val = scan.nextLong();
                if(max==0){
                 System.out.println("Set size first");
                }
                else if(max!=0) {q.insert(val);
               
                }
                break;

                case 3 :
                
                 if(max==0){
                    System.out.println("Set size first");
                   }
                 
                   else if(max!=0) {
                    System.out.println("removed value is "+q.remove());
                   }
                 break;
                
                case 4 :
                
                 if(max==0){
                    System.out.println("Set size first");
                   }
                   else if(max!=0) {
                    System.out.println("Enter the index of element you want to inquire about ");
                    int i = scan.nextInt();
                    System.out.println("Value peeked at "+i+" is "+q.peekn(i));
                   }
                 break;

                case 5 :
                
                 if(max==0){
                    System.out.println("Set size first");
                   }
                   else if(max!=0) {
                    q.display("queue 1 ");
                   }
                 break;
                
                case 6 :
               
                flag = false;
                 break;

                default :
                System.out.println("The option is wrong ");
                 
            }// close switch

        } // close 1st while
        
    }
}
