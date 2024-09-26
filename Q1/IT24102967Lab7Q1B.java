import java.util.Scanner;
public class IT24102967Lab7Q1B{
    public static void main (String [] args)
    {

        for(int i=0;i<3;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Student "+(i+1));
            System.out.print("Enter marks:");

            double mark1= input.nextDouble();
            double mark2= input.nextDouble();
            double mark3= input.nextDouble();
            double mark4= input.nextDouble();
            
            double Average = (mark1 + mark2 + mark3 + mark4)/4; 

            System.out.println("Average is:"+ Average);
           
           if (Average >= 75 && Average <= 100){
            System.out.println("Overall Grad is : Distinction");
           }
           else if  (Average >= 50 && Average <= 74){
            System.out.println("Overall Grad is : Credit");
           }
           else {
            System.out.println("Overall Grad is : Fail");

            
           }
   
           System.out.println('\n'); 
            
            
        }
        


    }
            
}