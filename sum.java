import java.util.Scanner;
public class sum
 {
    public static void main(String[] args)
     {
         float sum=0,average;
        Scanner  iin=new Scanner(System.in);
        int students[]=new int[10];
        System.out.println("Enter students marks");
        for(int f=0; f<students.length;f++)
        {
       students[f]=iin.nextInt();
        }
        
        for(int f=0; f<students.length;f++)
        {
            System.out.println(students[f]);
            sum=sum+students[f];
        }
        average=sum/students.length;
        System.out.println("sum is: "+sum+"and average is: "+average);
    }
}
