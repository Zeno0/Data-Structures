public class insertionsort {
    int []a={77,20,30,97,87,81,93,100};                   //this program doesnt take the input from user the variable a already has sample data to sort
    public void display(){                                //display method
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
           
        }
        System.out.println(" ");
       
    }
     public void sort56(){                               //sort method
            int in,out;
            for(out=1;out<=a.length-1;out++){            //it begins with 1st index
                int temp = a[out];
                in=out;
                while(in>0&&a[in-1]>=temp){              //if condition satisfied then swap with one before the already taken data
                    a[in]=a[in-1];
                    a[in-1]=temp;
                    in--;                                // to terminate loop
                }
                
            }
           
        }
    public static void main (String[] args){             //main 
       insertionsort i = new insertionsort();
       i.display();
       i.sort56();
       i.display();
       
    }
}
