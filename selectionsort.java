public class selectionsort {
    int []a={77,20,30,97,87,81,93,100};                   //this program doesnt take the input from user the variable a already has sample data to sort
 

   public void display(){                    // display method        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
           
        }
        System.out.println(" ");
       
    }
    public void sort(){                      //sort method
        int out,in,min;
        for(out=0;out<a.length;out++){
            min=out;
            for(in=out+1;in<a.length;in++){
                if(a[in]<a[min]){
                 min=in;  
                   
                }
            }
             swap(out,min);
        }
    }
    public void swap(int a1,int b){         //swap method
        int temp;
        temp=a[a1];
        a[a1]=a[b];
        a[b]=temp;
    }
    
    
    public static void main (String[] args){    // main 
       selectionsort i = new selectionsort();
       i.display();
       i.sort();
       i.display();
       
    }
    
}