//doNe ND dusted 
public class maxsubarr {

    public static void main(String args[]){
     int nums[]={1,2,33,34,43,45,46};
     printsubarr(nums);
    }
 
 
     public static void printsubarr(int arr[]){
         int j,k;
         for(int i=0;i<=arr.length;i++){
             for(j=i;j<=arr.length;j++){
                 for(k=i;k<j;k++){
                     System.out.print(arr[k]+" ");
                
                     
                 }
                 System.out.println();
             }
             
         }
     }
      
 }