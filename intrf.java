package OOPS;

public class intrf {
    public static void main(String agrs []) {

        // Queen q1 = new Queen();
        // q1.moves();

        // King k1 = new King();
        // k1.moves();

        // Beer b1 = new Beer();
        // b1.live();
        // b1.hunt();
        // b1.searchG();

        // b1.eat = "Eats meat";

        // M800 m1 = new M800();
        // m1.body();
        // m1.engine();
        // m1.speed();
        // m1.wheel();




        // Child ravi = new Child();
        // ravi.chest();
        // ravi.eyeColor();
        // ravi.fingers();
        // ravi.hairs();
        // ravi.hands();
        // ravi.lips();
        // ravi.legs();
        // ravi.nose();

        

    }
}



interface ChessPLayer {
    void moves();


}

class Queen implements ChessPLayer {

    public void moves() {
        
       System.out.println("left, right, down, up, diagonal in all dirns");       //if we do not make it public then interface not match this funx coz in //interface methods are public, abstr. and without implementation 
    }                                                                           //by default here default | AS is present 
                         
    }   
    
    

 class King implements ChessPLayer {

    public void moves() {
        System.out.println("left, right, up, down, diagonal in all dirns by step 1 only");
    }
 }   



 interface Carnvore {  //iski saare methods and properties implement class me aaengi Beer

    // String eat = "Eats meat";

    void hunt();
    void live();
 }

 interface Harvivore {  //iski saare methods and properties implement class me aaengi Beer

    

    void searchG();
    void live();
 }



 class Beer implements Carnvore, Harvivore {

   public void hunt() {
        System.out.println("Beer hunt for meat");
    }

   public void live() {
         System.out.println("Beer lives in cave");
    }

   public void searchG() {
        
         System.out.println("Beer donot eat grass");
    }
    
 }




 interface Car {
    int speed = 120;
    String engine = "1200hp";
    int wheel = 4;
    String body = "metal";

    void speed();
    void engine();
    void wheel();
    void body();


 }


 class M800 implements Car {

    public void speed() {
        System.out.println(this.speed);
    }

    public void engine() {

        System.out.println(this.engine);
    }

    public void wheel() {
        System.out.println(this.wheel);
    }

    public void body() {
        System.out.println(this.body);
    }

 }




 interface Father {

    void eyeColor();
    void nose();
    void hairs();
    void chest();
 }

 interface Mother {

    void lips();
    void hands();
    void fingers();
    void legs();
 }


 
 class Child implements Mother, Father {

    public void lips() {
        System.out.println("lips look like mother");
    }


     public void hands() {
        System.out.println("hands look like mother");
    }


     public void fingers() {
        System.out.println("fingers look like mother");
    }


     public void legs() {
        System.out.println("legs look like mother");
    }
    

    public void eyeColor() {
        System.out.println("eyes look like father");
    }

    public void nose() {
        System.out.println("nose look like father");
    }

    public void hairs() {
        System.out.println("hairs look like father");
    }

    public void chest() {
        System.out.println("chest look like father");
    }
    
 }