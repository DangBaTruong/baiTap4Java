public class Main {
    public static void main(String[] args) {
                Point point = new Point(2.0f, 3.0f);
                System.out.println(point);

                point.setX(5.0f);
                point.setY(6.0f);
                System.out.println(point);

                MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
                System.out.println(movablePoint);

                movablePoint.setXSpeed(1.0f);
                movablePoint.setYSpeed(1.0f);
                System.out.println(movablePoint);

                movablePoint.move();
                System.out.println(movablePoint);
            }
        }