package day54.Lesson.src;


public class Tutorials {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box(10, 20);
        Box b2 = new Box(10, 20);
        Box b3 = new Box(b1);
        Box b4 = b2.duplicate();

        b1.display();
        b2.display();
        b3.display();
        b4.display();

        //using isEqual() method to check if equal
        if (b1.isEqual(b2)) {
            System.out.println("b1 and b2 are equal.");
        }else{
            System.out.println("b1 and b2 are not equal.");
        }

        //using method with parameters to check if objects are equal
        if (Box.isTwoObjectsEqual(b1, b2)) {
            System.out.println("b1 and b2 are equal.");
        }else{
            System.out.println("b1 and b2 are not equal.");
        }
        

    }
}
