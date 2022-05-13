package day54.Lesson.src;

public class Box {
    int width;
    int height;

    Box(int w, int h) {
        width = w;
        height = h;
    }

    //Pass object to a constructor
    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
    }

    //Pass object to a method
    boolean isEqual(Box b) {
        if (this.width == b.width && this.height == b.height) 
            return true;
        else 
            return false;
    }

    //return object (instead of variable)
    Box duplicate() {
        //this keyword is same as this.width, this.height.
        Box temp = new Box(this); 
        return temp;
    }

    //Pass multiple objects as parameters
    static boolean isTwoObjectsEqual(Box b1, Box b2) {
        if(b1.width == b2.width && b1.height == b2.height)
        return true;
    else
        return false;
    }
    
    void display() {
        System.out.println("Width is " + this.width + " and the height is " + this.height);
    }

}
