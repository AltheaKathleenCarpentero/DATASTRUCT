import java.util.*;

   public class Pattern {
      public static void main(String[] args){
      
      int num = 5;
      int x, y;
      
       for(x = 1; x <= num; x++){
       
         for( y = 1; y <= num - 1; y++){
         System.out.print(" ");
        }
         for(y = 1; y <= x * 2 - 1; y++){
         System.out.print("*");
         }
         System.out.println();
       }
      }
   }