package operators;

public class LogicalOpDemo {

    public static void main(String args[]){
        Perrsom p= new Perrsom("Kumar","doc");
       // System.out.println(Perrsom.i);
        first: for(int i=0;i<5;i++){
                 for(int j=1;j>0;j--) {
                     if (i != j) {
                         System.out.println("Before Continue");
                         continue first;
                     } else{
                         System.out.println(i+j);
                 }

                 }
        }
    }
}

