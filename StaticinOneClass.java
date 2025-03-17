public class StaticinOneClass {
   static int a;
   static void display(){
    System.out.println("Static method");
   }
   static{  // static block will be executed first
    System.out.println("Static block");
   }


    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(a);
          display();
    }

}
