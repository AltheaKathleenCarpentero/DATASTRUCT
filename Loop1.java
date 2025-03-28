import java.util.*;

    public class Loop1{
      public static void main(String[] args){
      int a = 13;
      int firstTerm = 0, secondTerm = 1;
      
      System.out.println("Fibonacci Series ( up to 13th term: )");
         for (int i = 1; i <= a; ++i){
         System.out.print(firstTerm + ", ");
         int Nextterm = firstTerm + secondTerm;
         firstTerm = secondTerm;
         secondTerm = Nextterm;
      
      }
      }
   
   }