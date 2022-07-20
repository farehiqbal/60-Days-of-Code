public class Oop1 {
    
    public String str;

    public Oop1(String str) {
        this.str = str;
    }

    
    public static void main(String[] args) {
        Oop1 obj1 = new Oop1("mango");
        Oop1 obj2 = obj1;

        Oop1 obj3 = new Oop1("mango");
        // obj1 = obj3;


        String str = new String("mango");
        String str2 = new String("mango");

        System.out.println(obj1 == obj2); // returns true, since it compares the reference or the objetcts.

        System.out.println(obj1.equals(obj3)); // false, because in case of objects, it also compares the reference of objects. obj1 & obj3 have diff referencees.
        System.out.println(str.equals(str2));// true, in case of string, the String class overrides the equals() method, and compares the content of strings only.
    }
    
    // Because equals() for String compares the content, not the object itself.

    // The equals method for class Object implements the most discriminating possible equivalence relation on objects; 
//     that is, for any non-null reference values x and y, this method returns true 
//     if and only if x and y refer to the same object (x == y has the value true).
// 
}
