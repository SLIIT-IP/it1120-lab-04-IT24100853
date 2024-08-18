import java.util.Scanner;

  public class IT24100853Lab4Q3 {
    public static void main(String[] args) {
 
     Scanner input=new Scanner(System.in);

       int number;
       String result;

    System.out.print("Enter a Number:");
    number=input.nextInt();
     
    
     result=number>0? "The number is: Positive": number<0? "The number is: Negative": "The number is: Zero";
   
    System.out.print(result);
 }
}
  
