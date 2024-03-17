package macotinactivity4;

import java.util.Scanner;

public class MACOTINactivity4 {

    public static void main(String[] args) {
           
        Scanner scn = new Scanner(System.in);
        int score;
        System.out.println("Imong Score sa Entrance Exam:");
        score = scn.nextInt();
         
        if (score >=70) {
       double GPA = 3.5;
  
            System.out.println("Ang imong GPA taas kay: " + GPA);
            System.out.println("Congratulations! ikaw pwede sa admission");

        } else if (score <=70){
            double GPA = 3.0;
        } else if (score <=50){
            double GPA = 2.5;
            } else if (score <=30){
            double GPA = 2.0;
      
            System.out.println("Ang imong GPA kay ubos: " + GPA);
            System.out.println("Sorry, dili ka pwede sa admission");

        }
        
        scn.close();

    }
}
