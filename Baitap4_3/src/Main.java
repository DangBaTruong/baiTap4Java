public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(4.5f, 5.6f, 7.8f);
        System.out.println(point3D);
        point3D.setXYZ(5.6f,1.5f,5.9f);
        System.out.println(point3D);
    }
}