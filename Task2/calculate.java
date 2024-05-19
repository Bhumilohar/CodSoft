import java.util.Scanner;  

class calculate
{
  public static void main(String args[])
  {
     float mark1,mark2,mark3,mark4,mark5,add;
     float percentage;
     char grade;

     Scanner sc1= new Scanner(System.in);
     System.out.println("-------------------------------------------------------------------");
     System.out.println("Enter your marks (out of 100)");
     System.out.println("Enter English mark=");
     mark1=sc1.nextFloat();

     Scanner sc2= new Scanner(System.in);
     System.out.println("Enter Maths mark=");
     mark2=sc2.nextFloat();

     Scanner sc3= new Scanner(System.in);
     System.out.println("Enter Science mark=");
     mark3=sc3.nextFloat();

     Scanner sc4= new Scanner(System.in);
     System.out.println("Enter Social Studies mark=");
     mark4=sc4.nextFloat();

     Scanner sc5= new Scanner(System.in);
     System.out.println("Enter 2nd Language mark=");
     mark5=sc5.nextFloat();

     add=mark1+mark2+mark3+mark4+mark5;
     System.out.println("-------------------------------------------------------------------");
     System.out.println("Addition is = "+add);
     System.out.println("-------------------------------------------------------------------");     
     percentage=(float)((add/500)*100);    
     System.out.println("Percentage is = "+percentage);
     System.out.println("-------------------------------------------------------------------");

    
    if(percentage>=80){
         grade = 'A';
      }else if(percentage>=60 && percentage<80){
         grade = 'B';
      }
      else if(percentage>=40 && percentage<59){
         grade = 'C';
      }
      else {
         grade = 'D';
      }

      switch(grade) {
         case 'A' :
            System.out.println("Your grade is A. Excellent ");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Your grade is ranks from B to C. Well done");
            break;
         case 'D' :
            System.out.println("Your grade is D. You passed");
         case 'F' :
            System.out.println("Your grade is F. Better try again");
            break;
         default :
         System.out.println("Invalid grade");
      }
     System.out.println("-------------------------------------------------------------------");
     System.out.println("Marks entered by user ");
     System.out.println("English marks are  = "+mark1); 
     System.out.println("Maths marks are  = "+mark2); 
     System.out.println("Science marks are  = "+mark3); 
     System.out.println("Social Studies marks are  = "+mark4); 
     System.out.println("2nd Language marks are  = "+mark5); 
     System.out.println("-------------------------------------------------------------------");
  }
} 