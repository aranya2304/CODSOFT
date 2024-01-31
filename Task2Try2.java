import java.util.Scanner;
public class Task2Try2 {
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int totalSubjects=s.nextInt();
        
        int arr[]=new int[totalSubjects];
        
        
        for(int i=0;i<totalSubjects;i++){
            System.out.println("Enter the  marks of subject "+(i+1)+" out of 100");
            arr[i]=s.nextInt();
            while(arr[i]>100||arr[1]<0){
                System.out.println("Invalid input! Plase enter marks between 0 and 100");
                arr[i]=s.nextInt();
            }     
        }

        float totalMarks=0;
        
        for(int i=0; i<totalSubjects; i++){
            totalMarks+=arr[i];
        }

        float percentage=totalMarks/totalSubjects;
        
        System.out.println("Result:");
        System.out.println("Total marks:"+totalMarks);
        System.out.println("Average percentage:"+percentage+"%");
        if(percentage>90)System.out.println("Grade:O");
        else if(percentage<=90&&percentage>80)System.out.println("Grade:A");
        else if(percentage<=80&&percentage>70)System.out.println("Grade:B");
        else if(percentage<=70&&percentage>60)System.out.println("Grade:C");
        else if(percentage<=60&&percentage>50)System.out.println("Grade:D");
        else if(percentage<=50&&percentage>40)System.out.println("Grade:E");
        else if(percentage<40)System.out.println("Grade:F");

        s.close();
    }
}
