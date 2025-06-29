import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.speed(1);
        turtle.hide(); // don't want to see the turtle

        // Draw flower
        turtle.penColor("red");
        turtle.width(2);
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 36; i++) {
                turtle.forward(2);
                turtle.left(10);
            }
            turtle.right(120); // Rotate for next petal
        }
        turtle.dot("purple",20);

        //Draw the stick of flowers
        turtle.speed(10); // just for the animation
        turtle.penColor("green");
        turtle.width(2);
        for(int i=0;i<10;i++){
            turtle.backward(10);
            turtle.left(0.75);
        }
        double turtle_X= turtle.getX(),turtle_Y= turtle.getY();// get the position of root of flowers
        turtle.right(45);
        for(int i=0;i<10;i++){
            turtle.forward(10);
            turtle.right(0.75);
        }


        //Draw another flower
        turtle.speed(1); // just for the animation
        turtle.penColor(Color.magenta);
        for (int i = 0; i < 6; i++) {
            // Draw one side of the petal
            for (int j = 0; j < 30; j++) {
                turtle.forward(1);
                turtle.left(3);
            }
            // Turn to start the other side
            turtle.left(120);
            // Draw the other side
            for (int j = 0; j < 30; j++) {
                turtle.forward(1);
                turtle.left(3);
            }
            // Re-orient for the next petal
            turtle.right(60); // Undo the left(120)
            turtle.right(360 / 2);
        }

        //Place the turtle at the root of the flowers
        turtle.up(); // don't want to leave the trail while going back
        turtle.setPosition(turtle_X,turtle_Y);

        //Draw the ground
        turtle.speed(250); // just for the animation
        turtle.right(75);
        turtle.down();
        turtle.penColor("brown");
        turtle.width(10);
        turtle.backward(250);
        turtle.forward(350);

        //Draw the frame of picture
        turtle.penColor(Color.black);
        turtle.width(3);
        for ( int i=0;i <3;i++){
            turtle.left(90);
            turtle.forward(350);
        }

        // Draw the sun
        turtle.speed(5); // just for the animation
        turtle.up();
        turtle.home();
        turtle.left(90);
        turtle.forward(200); // Raise to sky
        turtle.left(90);
        turtle.forward(100); // move a little to the left
        turtle.down();

        // Draw the sun disk
        turtle.penColor(Color.orange);
        turtle.dot(Color.orange, 50);

        // Draw sun rays
        int rayCount = 12;
        turtle.width(4);

        for (int i = 0; i < rayCount; i++) {
            turtle.forward(40);  // Draw outward ray
            turtle.backward(40); // Return to center
            turtle.left(360.0 / rayCount); // Rotate for next ray
        }
    }
}
