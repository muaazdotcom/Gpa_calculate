import java.util.Scanner;
public class function{
    static void Quiz()
        {float q1,q2,q3,q4,Quizes;
            Scanner sc =new Scanner(System.in);
            System.out.print("enter your Q1 marks: ");
            q1=sc.nextFloat();
            System.out.print("enter your Q2 marks: ");
            q2=sc.nextFloat();
            System.out.print("enter your Q3 marks:");
            q3=sc.nextFloat();
            System.out.print("enter your Q4 marks: ");
            q4=sc.nextFloat();
            Quizes=(q1+q2+q3+q4);
            System.out.println("Quiz total is "+Quizes);
           double Quizpercentage =(Quizes/40.0)*15;
            System.out.printf("percentage is %.2f%% :",Quizpercentage);
        }

    static void main(String[] args) {
        Quiz();
    }

    }

