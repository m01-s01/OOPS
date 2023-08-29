import java.util.*;

public class OOPS {
    public static void main (String agrs[]) {

        Scanner sc = new Scanner(System.in);

        // Pen p1 = new Pen();
        // p1.changeColor("orange");
        // p1.changetip(5);
        // p1.changebrand("cello");

        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        // System.out.println(p1.brand);

        // Pen p2 = new Pen();
        // p2.changeColor("violet");
        // p2.changetip(9);
        // p2.changebrand("classmate");


        // System.out.println(p2.color);
        // System.out.println(p2.tip);
        // System.out.println(p2.brand);



        // Student s1 = new Student();

        
        // System.out.print("NAME :");
        // String name = sc.nextLine();
        // s1.newName(name);
        // System.out.println();


        // System.out.print("Father Name :");
        // String Fname = sc.nextLine();
        // s1.newFname(Fname);
        // System.out.println();

        
        // System.out.print("Roll number :");
        // int roll = sc.nextInt();
        // s1.newRoll(roll);
        // System.out.println();

        
        // System.out.print("Age :");
        // int age = sc.nextInt();
        // s1.newAge(age);
        // System.out.println();
        
        
        // System.out.print("enter the marks :");
        // int phy = sc.nextInt();
        // int chem = sc.nextInt();
        // int math = sc.nextInt();

        // s1.calMarks(phy, chem, math);
        // System.out.println();

        // System.out.println(s1.name);
        // System.out.println(s1.Fname);
        // System.out.println(s1.roll);
        // System.out.println(s1.age);
        // System.out.println(s1.marks + "%");


        

        // bankAccont myAcc = new bankAccont();

        // myAcc.username = "MEENU_SONI";
        // myAcc.setPass("abcd");

        // System.out.print(myAcc.pass);
        


    }
    
}


class Pen {

    int tip;
    String color;
    String brand;

    void changeColor (String newcolor) {
        color = newcolor;

    }

    int changetip (int newtip) {
        tip = newtip;
        return tip;
    }

    void changebrand (String newBrand) {
        brand = newBrand;

    }
}

class Student {

    
    int roll;
    int age;
    int marks;
    String name;
    String Fname;

    int newRoll (int newRoll) {

        roll = newRoll;
        return roll;
    }

    int newAge (int newAge) {

        age = newAge;
        return newAge;
    }

    int calMarks (int p, int c, int m) {

        marks = (p+c+m)/3;
        return marks;
    }

    String newName(String newName) {

        name = newName;
        return name;
    }

    void newFname (String newFname) {

       Fname = newFname; 
    }
}


class bankAccont {

    public String username;
    private String pass;

    public void setPass (String pwd) {

        pass = pwd;
    }


}