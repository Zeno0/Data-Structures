
import java.util.Arrays;
import java.util.Scanner;



public class stack {
    static Scanner scan = new Scanner(System.in);
    int max;
    char[] arr;  // array where data is saved
    int top;
    
    // Constructor with int Argument 
    public stack(int s){
        max=s;   // max size of array is set
        arr= new char[max];
        top=-1;  // top is by default -1
        
    }
    // Constructor without an argument 
    public stack(){
        max = 0;
        arr= new char[max];
        top=-1;  // top is by default -1
        
    }
    // push method 
     public void push(char j){
         arr[++top]=j; // top index is set 
     }
     // pop method
    public char pop(){
        return arr[top--];  // since data is poped i.e top is decremented
    }
    // isempty method
    public boolean isempty(){
        return(top==-1);
    }
    // isfull method
    public boolean isfull(){
        return (top==max-1);
    }
    // peekn method
    public char peekn(int x){
        return  arr[x]; // returns data at 'x' index
    }
    // size method
    public int size(){
        return top+1;  // returns the value of number of elemnts in array
    }
    // display method
    public void display( String s){
       
        System.out.println(s+" Stack (top to bottom): ");
        for(int i=size()-1;i>=0;i--){
            System.out.print(peekn(i)+"/");  // display characters using peekn method
           
        }
        System.out.println("");
        System.out.println();
    }
    // read method
    public char[] read(){
        String x = null;
        
        Scanner scan2 = new Scanner(System.in);
        x = scan2.nextLine(); // scan the line entered by user 
        
      
      max = x.length();  
          arr = new char[max];
          top = max -1;
          
          for(int i=0; i<max;i++){
              arr[i]= x.charAt(i);// fill array with the characters of string
              
          }
          
          return arr;
    }
    // override toString() method
    public String toString(){
        return Arrays.toString(arr);
    }
    // main 
    public static void main (String [] args){
       boolean A = true;
       int c=0;
       while(A){  // 1st while
           System.out.println("Choose options: ");
           System.out.println("1: for String stack ");
           System.out.println("2: for normal character stack ");
           System.out.println("3: for close");
          
        
            c = scan.nextInt(); // option entered
          
        
           if(c == 1){  // for case 1
            stack stack1 = new stack();
            System.out.println("please enter whatever you want in one line ");
            stack1.read();   // call read method
            stack1.display("stack1");  
            System.out.println("stack 1 contains "+stack1);  
           }
           else if(c == 2){  // for case 2
              
        boolean flag = true;
        int size=0;
        stack stack2 = null;
        while(flag){  // 2nd while
            int x=0;
            // optioms
            System.out.println("Enter any options ");
            System.out.println("1: to set the size of stack ");
            System.out.println("2: for push ");
            System.out.println("3: for pop ");
            System.out.println("4: for peek at any index of stack ");
            System.out.println("5: for display");
            System.out.println("6: for exit ");
            
             x = scan.nextInt();
           
            switch(x){
                case 1 :   
                 size= scan.nextInt();
                 stack2 = new stack(size);
                 break;

                case 2 :
                System.out.println("Enter the character you want to enter ");
                String str = scan.next();
                char val2 = str.charAt(0);
                stack2.push(val2);
                System.out.println("you pushed: "+val2);
                break;

                case 3 :
                 System.out.println("Popped value is "+stack2.pop());
                 break;
                
                case 4 :
                 System.out.println("Enter the index of element you want to inquire about ");
                 int i = scan.nextInt();
                 System.out.println("Value peeked at "+i+" is "+stack2.peekn(i));
                 break;

                case 5 :
                 stack2.display("stack2 ");
                 break;
                
                case 6 :
               
                flag = false;
                 break;

                default :
                System.out.println("The option is wrong ");
                 
            }// close switch
        }  // close 2nd while

           } // close else if
           else if(c == 3){
               A = false;
           }
           else{
               System.out.println("wrong option ");
           }
        } // close 1st while
    } // main close 
        
        
    }  // class close

