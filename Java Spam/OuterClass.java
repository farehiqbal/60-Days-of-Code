public class OuterClass {
    
    static class InnerClass{

        String name;

        public InnerClass(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass a = new InnerClass("xyz");

        System.out.println(a);
        System.out.println(a.name);


        // Outerclass b = new InnerClass("mango");

    }
}
