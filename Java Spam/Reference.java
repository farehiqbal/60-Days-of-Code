// A look at reference variables.



public class Reference {
    int x = 10;
    int display(){
        System.out.println("X = " + x);
        return 0;
    }

    class Main{

        public static void main(String[] args) {
            Reference D1 = new Reference();  // D1 is the reference variable.
            System.out.println(D1);

            System.out.println(D1.display());
        }
    }
}


// D1 is the reference variable.
// When we create an object, the default constructor is called and and returns a reference of object.
// This reference is stored in a variable called the reference variable.

// Value of a reference variable is a reference. Printing it gives us the TYPE of variable and 
// hash code created for it by java, that is in hexadecimal. 