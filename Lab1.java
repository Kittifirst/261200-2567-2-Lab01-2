import java.awt.*;

public class Lab1 {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
//        bob.speed(0.1);
        bob.penColor("Green");
        bob.forward(150);
        bob.left(90);
        bob.forward(50);

        bob.left(130);
        bob.forward(25);
        bob.right(90);
        bob.forward(25);
        for (int i = 0; i < 4; i++) {
            bob.left(96);
            bob.forward(25);
            bob.right(94);
            bob.forward(25);
        }
        bob.left(133);
        bob.forward(49);
        bob.left(90);
        bob.home();
        bob.up();
        bob.forward(62);
        bob.left(90);
        bob.forward(45);
        bob.down();
        bob.width(8);
        bob.penColor(Color.yellow);
        bob.forward(40);
        bob.width(1);
        bob.penColor(Color.black);
        bob.forward(10);
        bob.up();
        bob.backward(5);
        bob.down();
        bob.penColor(Color.orange);
        bob.width(8);
        bob.forward(2);
        bob.up();
        bob.backward(50);
        bob.home();
        bob.left(180);
        bob.penColor(Color.blue);
        bob.forward(23);
        bob.width(3);
        bob.forward(50);
        bob.left(90);
        bob.forward(30);
        bob.left(90);
        bob.forward(10);
        for (int i=0;i<4;i++) {
            bob.down();
            bob.forward(10);
            bob.left(20);
            bob.forward(10);
            bob.right(25);
            bob.forward(10);
            bob.left(3);
            bob.up();
            bob.forward(30);
        }
        bob.up();
        bob.forward(30);
        bob.right(87);
        bob.forward(30);
        bob.right(84);
        bob.forward(20);
        for (int i=0;i<5;i++) {
            bob.down();
            bob.forward(10);
            bob.left(20);
            bob.forward(10);
            bob.right(25);
            bob.forward(10);
            bob.left(3);
            bob.up();
            bob.forward(30);
        }
        bob.up();
        bob.home();
        bob.forward(60);
        bob.left(90);
        bob.forward(180);
        bob.down();
        bob.width(5);
        bob.penColor(Color.black);
        bob.forward(10);
        bob.penColor(Color.red);
        for (int i = 0; i < 36; i++) {
            bob.forward(50); 
            bob.backward(50);
            bob.right(360 / 36);
        }
        for (int i = 0; i < 36; i++) {
            bob.penColor(Color.pink);
            bob.forward(50);
            bob.backward(50);
            bob.right(360 / 30);
        }
        bob.width(1);
        for (int i = 0; i < 36; i++) {
            bob.penColor(Color.blue);
            bob.forward(50);
            bob.backward(50);
            bob.right(360 / 30);
        }
        bob.up();
        bob.home();
        bob.left(180);
        bob.forward(150);
        bob.right(90);
        bob.forward(150);
        bob.down();
        bob.width(10);
        for (int i = 0; i < 40; i++) {
            bob.penColor(Color.yellow);
            bob.forward(50);
            bob.backward(50);
            bob.right(360 / 36);
        }
        bob.up();
        bob.forward(20);
        bob.down();
        for (int i = 0; i < 40; i++) {
            bob.penColor(Color.white);
            bob.forward(10);
            bob.backward(10);
            bob.right(360 / 36);
        }
        bob.up();
        bob.home();
    }
}
