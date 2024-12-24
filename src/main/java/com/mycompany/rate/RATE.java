package com.mycompany.rate;

import java.util.Scanner;

public class RATE {

    static Scanner scan = new Scanner(System.in);

    final static double 
        AP=5.0,A=4.75,
        BP=4.5,B=4,
        CP=3.5,C=3,
        DP=2.5,D=2;    
    
    public static void main(String[] args) {

        int choose=0;
        do{
        System.out.printf("Welcome to calculate RATE%nPlease choose what you want%n0.Exit the program%n1.Computer engineering%n2.Computer science%n3.Information systems%n4.Software engineering%n");
        choose=scan.nextInt();
        
        switch(choose){
         case 1:
          ce();
          break;
         
          case 2:
          cs();
          break;
          
          case 3:
          is();
          break;
          
          case 4:
          sw();
          break;
          
          case 0:
              System.out.println("have a good day!");
              break;
          default:
          System.out.println("Error!!");
          }
        }while(choose != 0);

    }
      
    public static void ce(){
        
        final double W1=0.75,W2=0.25;
    
        double RATE=0.0,GPA=0.0,SA=0.0,G1=0.0,G2=0.0;
        String grade1,grade2;
        
        System.out.printf("Nice! your choose is Computer engineering%nPlese enter GPA:%n");
        GPA=scan.nextFloat();
        
        System.out.println("Plese enter your SA:");
        SA=scan.nextFloat();
        
        System.out.println("Plese enter your grade in Logical design:");
        grade1=scan.next();
        
        System.out.println("Plese enter your grade in Discrete mathematics:");
        grade2=scan.next();
        
        if(grade1.equalsIgnoreCase("A+"))
            G1=AP;
        else if(grade1.equalsIgnoreCase("A"))
            G1=A;
        else if(grade1.equalsIgnoreCase("B+"))
            G1=BP;
        else if(grade1.equalsIgnoreCase("B"))
            G1=B;
        else if(grade1.equalsIgnoreCase("C+"))
            G1=CP;
        else if(grade1.equalsIgnoreCase("C"))
            G1=C;
        else if(grade1.equalsIgnoreCase("D+"))
            G1=DP;
        else if(grade1.equalsIgnoreCase("D"))
            G1=D;
        
        if(grade2.equalsIgnoreCase("A+"))
            G2=AP;
        else if(grade2.equalsIgnoreCase("A"))
            G2=A;
        else if(grade2.equalsIgnoreCase("B+"))
            G2=BP;
        else if(grade2.equalsIgnoreCase("B"))
            G2=B;
        else if(grade2.equalsIgnoreCase("C+"))
            G2=CP;
        else if(grade2.equalsIgnoreCase("C"))
            G2=C;
        else if(grade2.equalsIgnoreCase("D+"))
            G2=DP;
        else if(grade2.equalsIgnoreCase("D"))
            G2=D;
        
        RATE = (GPA + SA + (W1*G1) + (W2*G2)) / 3;
        System.out.printf("your RATE is: %.2f%n",RATE);

    }
    
    public static void cs(){
        
        final double W1=0.25,W2=0.75;
    
        double RATE=0.0,GPA=0.0,SA=0.0,G1=0.0,G2=0.0;
        String grade1,grade2;
        
        System.out.printf("Nice! your choose is Computer science%nPlese enter GPA:%n");
        GPA=scan.nextFloat();
        
        System.out.println("Plese enter your SA:");
        SA=scan.nextFloat();
        
        System.out.println("Plese enter your grade in Discrete mathematics:");
        grade1=scan.next();
        
        System.out.println("Plese enter your grade in programming:");
        grade2=scan.next();
        
        if(grade1.equalsIgnoreCase("A+"))
            G1=AP;
        else if(grade1.equalsIgnoreCase("A"))
            G1=A;
        else if(grade1.equalsIgnoreCase("B+"))
            G1=BP;
        else if(grade1.equalsIgnoreCase("B"))
            G1=B;
        else if(grade1.equalsIgnoreCase("C+"))
            G1=CP;
        else if(grade1.equalsIgnoreCase("C"))
            G1=C;
        else if(grade1.equalsIgnoreCase("D+"))
            G1=DP;
        else if(grade1.equalsIgnoreCase("D"))
            G1=D;
        
        if(grade2.equalsIgnoreCase("A+"))
            G2=AP;
        else if(grade2.equalsIgnoreCase("A"))
            G2=A;
        else if(grade2.equalsIgnoreCase("B+"))
            G2=BP;
        else if(grade2.equalsIgnoreCase("B"))
            G2=B;
        else if(grade2.equalsIgnoreCase("C+"))
            G2=CP;
        else if(grade2.equalsIgnoreCase("C"))
            G2=C;
        else if(grade2.equalsIgnoreCase("D+"))
            G2=DP;
        else if(grade2.equalsIgnoreCase("D"))
            G2=D;
        
        RATE = (GPA + SA + (W1*G1) + (W2*G2)) / 3;
        System.out.printf("your RATE is: %.2f%n",RATE);

    
    }
    
    public static void is(){
        
        final double W1=0.75,W2=0.25;
    
        double RATE=0.0,GPA=0.0,SA=0.0,G1=0.0,G2=0.0;
        String grade1,grade2;
        
        System.out.printf("Nice! your choose is Information systems%nPlese enter GPA:%n");
        GPA=scan.nextFloat();
        
        System.out.println("Plese enter your SA:");
        SA=scan.nextFloat();
        
        System.out.println("Plese enter your grade in programming:");
        grade1=scan.next();
        
        System.out.println("Plese enter your grade in Logical design:");
        grade2=scan.next();
        
        if(grade1.equalsIgnoreCase("A+"))
            G1=AP;
        else if(grade1.equalsIgnoreCase("A"))
            G1=A;
        else if(grade1.equalsIgnoreCase("B+"))
            G1=BP;
        else if(grade1.equalsIgnoreCase("B"))
            G1=B;
        else if(grade1.equalsIgnoreCase("C+"))
            G1=CP;
        else if(grade1.equalsIgnoreCase("C"))
            G1=C;
        else if(grade1.equalsIgnoreCase("D+"))
            G1=DP;
        else if(grade1.equalsIgnoreCase("D"))
            G1=D;
        
        if(grade2.equalsIgnoreCase("A+"))
            G2=AP;
        else if(grade2.equalsIgnoreCase("A"))
            G2=A;
        else if(grade2.equalsIgnoreCase("B+"))
            G2=BP;
        else if(grade2.equalsIgnoreCase("B"))
            G2=B;
        else if(grade2.equalsIgnoreCase("C+"))
            G2=CP;
        else if(grade2.equalsIgnoreCase("C"))
            G2=C;
        else if(grade2.equalsIgnoreCase("D+"))
            G2=DP;
        else if(grade2.equalsIgnoreCase("D"))
            G2=D;
        
        RATE = (GPA + SA + (W1*G1) + (W2*G2)) / 3;
        System.out.printf("your RATE is: %.2f%n",RATE);

        
    
    }
    public static void sw(){
    
        
        final double W1=0.5,W2=0.5;
    

        double RATE=0.0,GPA=0.0,SA=0.0,G1=0.0,G2=0.0;
        String grade1,grade2;
        
        System.out.printf("Nice! your choose is Software engineering%nPlese enter GPA:%n");
        GPA=scan.nextFloat();
        
        System.out.println("Plese enter your SA:");
        SA=scan.nextFloat();
        
        System.out.println("Plese enter your grade in Logical design:");
        grade1=scan.next();
        
        System.out.println("Plese enter your grade in programming:");
        grade2=scan.next();
        
        if(grade1.equalsIgnoreCase("A+"))
            G1=AP;
        else if(grade1.equalsIgnoreCase("A"))
            G1=A;
        else if(grade1.equalsIgnoreCase("B+"))
            G1=BP;
        else if(grade1.equalsIgnoreCase("B"))
            G1=B;
        else if(grade1.equalsIgnoreCase("C+"))
            G1=CP;
        else if(grade1.equalsIgnoreCase("C"))
            G1=C;
        else if(grade1.equalsIgnoreCase("D+"))
            G1=DP;
        else if(grade1.equalsIgnoreCase("D"))
            G1=D;
        
        if(grade2.equalsIgnoreCase("A+"))
            G2=AP;
        else if(grade2.equalsIgnoreCase("A"))
            G2=A;
        else if(grade2.equalsIgnoreCase("B+"))
            G2=BP;
        else if(grade2.equalsIgnoreCase("B"))
            G2=B;
        else if(grade2.equalsIgnoreCase("C+"))
            G2=CP;
        else if(grade2.equalsIgnoreCase("C"))
            G2=C;
        else if(grade2.equalsIgnoreCase("D+"))
            G2=DP;
        else if(grade2.equalsIgnoreCase("D"))
            G2=D;
        
        RATE = (GPA + SA + (W1*G1) + (W2*G2)) / 3;
        System.out.printf("your RATE is: %.2f%n",RATE);

            
    }
    
}
