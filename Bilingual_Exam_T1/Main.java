package Bilingual_Exam_T1;

import java.util.Scanner;

public class Main {

    public static void readNumbers(){
        Scanner scan=new Scanner(System.in);
        
        int number=0;
        int save=0; 
        
            while(number!=-1){
                System.out.println("Put a number different to -1");
                number=scan.nextInt();
                save++;
            }

        int number1=0;
        int save1=0;
        
            for(number1=0; number1>=save1; save1++){
                System.out.println("Put a number");
                number1=scan.nextInt();
                
            }
        
        System.out.println("Select a option: 1/2/3/4");
        int option;
        option=scan.nextInt();
        
            switch(option){

                case 1:
                    System.out.println(save+save1);
                    break;

                case 2:
                    
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    break;
            }
        
                
    }
    
    
    public static void main(String[] args) {
        
        /*PoliceStation one=new PoliceStation();
        PoliceStation two=new PoliceStation("333qwer", 17-11-2021, "composition of legalization", "dissapear");

        //two.printCurrentPaper();
        //one.readNewPapers();
        two.last(19-11-2021);*/
        
        readNumbers();
    }
    
}
