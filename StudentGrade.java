import java.util.Scanner; 

public class StudentGrade {

   public static void main(String[] args) {


       Scanner myScanner = new Scanner(System.in); 


       System.out.print("Please enter the student's exam marks: "); 

       int studentMarks = myScanner.nextInt(); 


       String studentGrade; 
       if (studentMarks >= 80 && studentMarks<=100) {
         
           studentGrade = "A+";
       } else if (studentMarks >=70 && studentMarks<=79) {
           
           studentGrade = "A";
       } else if (studentMarks >= 60 && studentMarks<=69) {
          
           studentGrade = "B";
       } else if (studentMarks>= 50 && studentMarks<=59) {
           
           studentGrade = "C";
       } else if(studentMarks>=40 && studentMarks<=49 ){
          
           studentGrade = "D";
       }else{
              studentGrade="F";
       }
      
       System.out.println("The student's grade is: " + studentGrade);

       myScanner.close(); 
   }
}