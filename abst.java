package OOPS;

public class abst {

    public static void printL() {
        System.out.println();
    }

    public static void printInt(int in) {
        System.out.println(in);
    }

    public static void main(String agrs[]) {



    //     Motorola m1 = new Motorola();
    //    // m1.pix(720);
    //     System.out.println(m1.ram(8));

    //    System.out.println( m1.pix(720));

    //    System.out.println(m1.name("Mtorola g60 fusion")); 
    //     m1.screen(120);
    //     System.out.println(m1.screenSize);







        // Bird b = new Bird();
        
        // b.eat();
        // b.walk();

        // Human sachin = new Human();

        // sachin.eat();
        // sachin.walk();


        // A1 meenu = new A1();
        // A2 neelu = new A2();

        // meenu.standerd( "Studying in class 12");
        // System.out.println(meenu.stand);
        //  meenu.roll(40);
        // System.out.println(meenu.roll);
        // meenu.age(17);
        // System.out.println(meenu.age);

        // neelu.standerd("studying in class 10");
        // System.out.println(neelu.stand);

        // neelu.roll(12);
        // System.out.println(neelu.roll);

        // neelu.age(14);
        // System.out.println(neelu.age);


        // Mustang m1 = new Mustang("Red");
        // System.out.println(m1.color);
        

        // Horse h1 = new Horse("Brown");
        // System.out.println(h1.color);

        


    }
}


 abstract class Animal {

    String color;

    Animal() {
        // color = "Brown";
        System.out.println("Animal constr is called...");

    }

    Animal(String color) {
        this.color = color;
    }

    
    void eat() {
        System.out.println("this animal eats");
    }

    abstract void walk();
}




class Horse extends Animal {

    Horse() {
        System.out.println("Horse constr is called");
    }

    Horse(String color) {
        this.color = color;
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }
}





class Mustang extends Horse {// make the smallest base class object and see the constr implementt

    Mustang() {
        System.out.println("Mustang constr is called....");
    }

    Mustang(String color) {
        this.color = color;
    }

     void walk() {
        System.out.println("walk on 4 legs");
    }
}




class Bird extends Animal {

    void walk() {
         System.out.println("this animal cannot walk but it can fly");
    }
}

class Human extends Animal {

    void walk() {
         System.out.println("human can walk on 2 legs");
    }
}


abstract class Student {

    String stand;
    int roll;
    int age;

    String standerd( String stand) {
        
        this.stand = stand;
        return stand;  
    }

    abstract int roll(int newroll);
    abstract int age(int newAge);
}

class A1 extends Student {

    int roll(int roll) {

        this.roll = roll;
        return this.roll;
    }

    int age( int newAge) {

        this.age = newAge;
        return this.age;
    }
}


class A2 extends Student {

    int roll(int r) {

        this.roll = r;
        return this.roll;
    }

    int age(int a) {

        this.age = a;
        return this.age;

    }
}

abstract class Phone {
    String name;
    int ram;
    int storage;
    int screenSize;
    int cameraPixel;

   

    abstract int ram(int ram);
    abstract int storage(int s);

    abstract void screen(int screen);

}


class Motorola extends Phone {

    int ram(int ram) {
        if(ram>4) {
           // printInt(ram);
           System.out.println(ram);
        }

        return ram;
    }

    int storage(int s) {
        this.storage = s;
        System.out.println(storage);
         return storage;
    }

    void screen(int scr) {
        this.screenSize = scr;
        System.out.println(screenSize);
    }

     int pix(int cameraPix) {
        this.cameraPixel = cameraPix;
        System.out.println(cameraPixel);
        return cameraPixel;
    }

    String name(String name) {
        this.name = name;
        System.out.println(name);
        return name;
    }

    // Motorola (int cameraPix) {
    //     this.cameraPixel = cameraPix;
    // }
   
}



abstract class family {
    int members;
    int females;
    int males;
    int children;
    int girlChild;
    int boyChild;
    String caste;

    family(String jaati) {
        this.caste = jaati;
    }
    abstract int girl();
    abstract int boy();
    
    abstract int male();
    abstract int female();
    abstract int members();
    





    

}