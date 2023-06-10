package lambda;

// Java code to sort the array according
// to x-coordinate using the lambda expression
import java.util.*;

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// Main class
class GfG
{
    public static void main (String[] args) {

        // Arrays of Point types
        Point arr[] = { new Point(10, 20),
                new Point(5, 30),
                new Point(30, 40) };

        // Arrays.sort() is called and the array is
        // passed alongside lambda expression
        // The lambda expression implements compare()
        // method of Comparator interface
        Arrays.sort(arr, (p1, p2)->p1.x - p2.y);
        for(int i = 0; i<arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}
