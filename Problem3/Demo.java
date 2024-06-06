package Problem3;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);

        System.out.println();
        System.out.println();
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint before move: " + mp1);
        
        // Move 1
        mp1.move();
        System.out.println("MovablePoint after move 1: " + mp1);

        // Move 2
        mp1.move();
        System.out.println("MovablePoint after move 2: " + mp1);

        // Additional Moves
        for (int i = 3; i <= 5; i++) {
            mp1.move();
            System.out.println("MovablePoint after move " + i + ": " + mp1);
           
        }
    }
}

