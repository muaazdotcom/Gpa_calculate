import java.util.Scanner;
public class Total {
   public  static void main(String[] args) {
        Float CP,Quizes ,Q1,Q2,Q3,Q4,Assignment,A1,A2,A3,A4,mids,finals;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your Cp marks: ");
        CP=sc.nextFloat();
        //Quizes
        System.out.print("enter your Q1 marks: ");
       Q1=sc.nextFloat();
       System.out.print("enter your Q2 marks: ");
       Q2=sc.nextFloat();
       System.out.print("enter your Q3 marks:");
       Q3=sc.nextFloat();
       System.out.print("enter your Q4 marks: ");
       Q4=sc.nextFloat();
       Quizes=((Q1+Q2+Q3+Q4)/40)*15;
        //assignment
        System.out.print("enter your A1 marks:");
        A1=sc.nextFloat();
        System.out.print("enter your A2 marks:");
        A2=sc.nextFloat();
        System.out.print("enter your A3 marks:");
        A3=sc.nextFloat();
        System.out.print("enter your A4 marks:");
        A4=sc.nextFloat();
        Assignment=((A1+A2+A3+A4)/40)*15;
        //mids
        System.out.print("enter your mid marks: ");
        mids=sc.nextFloat();
        //final
        System.out.print("enter your final marks: ");
        finals=sc.nextFloat();
        //Total
        double total =100;
        //calculation
        float obtainedmarks =CP+Quizes+Assignment+mids+finals;
        double percentage = (obtainedmarks/total)*100;
        System.out.println("Your obtained marks is"+ obtainedmarks);
        System.out.printf("percentage is:%.1f%%%n",percentage );
        if(percentage>=0 && percentage <=49 )
        {
            System.out.println("grade is fail");
        }
        if(percentage>=50 && percentage<60)
        {
            System.out.println("grade is D");
        }
        if(percentage>=60 && percentage<70)
        {
            System.out.println("grade is C");
        }
        if(percentage>=70 && percentage<80)
        {
            System.out.println("grade is B");
        }
        if(percentage>=80 && percentage<=100)
        {
            System.out.println("grade is A");
        }


    }
}
