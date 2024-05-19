import java.util.Scanner;
import java.util.Random;

public class guessnumber 
{

 public static void main(String args[])
 {

 Scanner sc=new Scanner(System.in);
 Random r=new Random();
   
 System.out.println("Ramdom Number guessing");

    int score=0;
    boolean playagain=true;
     
    while(playagain)
    {
         int number=r.nextInt(100)+1;
         int numoftime=0;
         int maxnumoftime=2;

         System.out.println("Number has been selected Guess between 1 to 100"); 
         
        while(numoftime<maxnumoftime)
        {
             System.out.println("Enter guess");
             int user=sc.nextInt();
             sc.nextLine();

            numoftime++;

            if(user==number)
            {
                System.out.println("You have guessed the number"+number+"in"+numoftime);
                break;    
            }
            else if(user<number){
            System.out.println("Very low");}
            else{
            System.out.println("Very high");}
        }
          if (numoftime>=maxnumoftime)
          {
             System.out.println("Number of attempts ended.Number is"+number);
          } 
          System.out.println("Do u want to play again yes/no = ");
          String playagaininput=sc.nextLine();
          playagain=playagaininput.equalsIgnoreCase("yes");
   }
     System.out.println("Game over Your score= "+score);
     sc.close();     
}
}
