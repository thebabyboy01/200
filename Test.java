import java.util.*;

class MyException extends Exception {
   public String containsNine() {
      return "The Number contains digit 9.";
   }
}

class Test {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);   
      System.out.print("\nEnter Number: ");
      int n=s.nextInt();
      MyException a=new MyException();
      try {
         while (n>0) {
            int t=n%10;
            if (t==9) throw a;
            n/=10;
         }
      } catch (MyException e) {
         System.out.println(e.containsNine());
      }      
   }
}
