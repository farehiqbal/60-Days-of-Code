package Game;

public class Main {

    public static void main(String[] args) {
        
        Player1 player = new Player1("Snake","Ariii" , 100);

        // player.damagebyGun1();
        player.damagebyGun1();
        // player.damagebyGun2();
        
        Player2 player2 = new Player2("Noob", "Ak", 80, true);

        player2.damagebyGun2();

        Player1 upcast = new Player2("Upcasting", "Upcast", 100, true);

        // The parent class refernce variable can refer the child class object, knows as upcasting.
        // Player1 is the parent class and Player2 is the subclass/childclass.

        


        
    }
    

    
}
