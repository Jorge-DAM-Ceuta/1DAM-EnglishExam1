package Bilingual_Exam_T1;

import java.util.Scanner;

public class PoliceStation {
    
    private String identification_code, description, department;
    private int date, numberOfPapers;
    private Scanner scan=new Scanner(System.in);
    
    PoliceStation(){
        identification_code="";
        date=0;
        description="";
        department="";
    }
    
    PoliceStation(String id, int da, String des, String dep){
        identification_code=id;
        date=da;
        description=des;
        department=dep;
    }
    
    public void setIdentification_code(String id){
    identification_code=id;
    }
    
    public void setDate(int da){
    date=da;
    }
    
    public void setDescription(String des){
    description=des;
    }
    
    public void setDepartment(String dep){
    department=dep;
    }
    
    
    public String getIdentification_code(){
    return identification_code;
    }
    
    public int getDate(){
    return date;
    }
    
    public String getDescription(){
    return description;
    }
    public String getDepartment(){
    return department;
    }
    
    public void printCurrentPaper(){
        System.out.println(identification_code);
         System.out.println(date);
          System.out.println(description);
           System.out.println(department);
        numberOfPapers++;
    }
    
    
    public void readNewPapers(){
        
        String option;
        System.out.println("Select: New Document / END");
        option=scan.nextLine();
        
        switch(option){
        
            case "New Document":
                
                System.out.println("ID: ");
                identification_code=scan.nextLine();
    
                System.out.println("Date: ");
                date=scan.nextInt();

                System.out.println("Description: ");
                description=scan.nextLine();

                System.out.println("Department: ");
                department=scan.nextLine();
                
                numberOfPapers++;
                
            break;
                
            case "END":
                break;
        }
    }
    
    public void last(int N_date){
        if(N_date>date){
            System.err.println("Error. The document is older");
        }
    }
    
}
