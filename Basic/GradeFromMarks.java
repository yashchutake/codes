import java.util.*;

public class GradeFromMarks {
   public static void main(String[] args) {
    Scanner ip=new Scanner(System.in);
    System.out.println("Enter a marks Between the 0 to 100 To convert in Grande");
    int marks=ip.nextInt();
    if(marks>0 && marks<=100){
    switch(marks/10){
        case 10:
        case 9:
        System.out.println("AA");
        break;

        case 8:
        System.out.println("AB");
        break;

        case 7:
        System.out.println("BB");
        break;

        case 6:
        System.out.println("BC");
        break;

        case 5:
        System.out.println("CD");
        break;

        case 4:
        System.out.println("DD");
        break;

        default :
        System.out.println("Fail");
    }
}
else{
    System.out.println("Enter a valid marks");
}

   } 
}
