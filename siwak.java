package helloworld;
import java.util.Scanner;
class studentinfo{
    

        int reg_no;

        String name, cl;

        void input() {

            Scanner sc = new Scanner(System.in);



            System.out.print("Enter Reg Number: ");

            reg_no = sc.nextInt();  



            sc.nextLine(); 



            System.out.print("Enter Name: ");

            name = sc.nextLine();



            System.out.print("Enter class: ");

            cl = sc.nextLine();

        }

    }

    class Student extends studentinfo {

        

        void display() {

            System.out.println("/ STUDENT DETAILS/");

            System.out.println("Reg Number is: "+reg_no);

            System.out.println("Your name is: "+name);

            System.out.println("Your class is: "+cl);

        }

        public static void main(String args[]) {

            Student obj = new Student();

            obj.input();

            obj.display();

        }

    }
