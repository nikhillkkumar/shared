import java.util.*;
import java.io.*;

class Dog {
    public void answer() {
        System.out.println("Yes this is dog");
    }
}

class Point {
    public double x, y;
    public Point(double x, double y) {
        this.x = x; this.y = y;
    }
    public double sum() {
        return this.x + this.y;
    }
    public void setX(double newx) {
        this.x = newx;
    }
}
    
class Scratch {
    public static void main(String[] args) {
        Point origin = new Point(0, 0);
        Point[] triangle = new Point[3];
        triangle[0] = origin;
        triangle[1] = new Point(3, 10);
        triangle[2] = new Point(0, 3);

        Point[] triclone = triangle.clone();

        triclone[1].setX(2.0);
        print(triangle[1].sum());

        byte[] a = { 1, 2, 3 };
        byte[] b = (byte[]) a.clone();

        int aa = 290138814;
        int bb = 290138814;
        if ("abc".equals("abc")) {
            print("equal");
        }

        Dog d = new Dog();
        d.answer();
    }

    public static void setHeadToZero(int[] arr) {
        arr[0] = 0;
    }
        
    public static void countdown(int from) throws InterruptedException {
        for (; from > 0; from--) {
            Thread.sleep(200);
            print(from);
        }
    }
    public static int getNumber(Object o) {
        String s = "one";
        return (int) o;
    }

    public static int divideBy(int x) {
        try {
            print("trying " + x);
            return 3 / x;
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            print("in finally block");
            return 10;
        }
    }
    public static void printRem(int x) {
        if (x % 2 == 0) {
            print("no rem");
            return;
        }
        print("remainder 1");
    }

    public static <T> void print(T arg) {
        System.out.println(arg);
    }
}
