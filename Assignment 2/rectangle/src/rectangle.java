//Program to determine whether two points are inside a box

import java.awt.*;

public class rectangle {
    public static void main(String[] args){
        Rectangle box = new Rectangle(5,5,67,7);
        Point p1 = new Point(1,1);
        Point p2 = new Point(7,7);

        if(box.contains(p1)){
            System.out.println("The point p1 is inside the box");
        }
        else{
            System.out.println("The point p1 is outside the box");
        }

        if(box.contains(p2)){
            System.out.println("The point p2 is inside the box");
        }
        else{
            System.out.println("The point p2 is outside the box");
        }
    }
}
