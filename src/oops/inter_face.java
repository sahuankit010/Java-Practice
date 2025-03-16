package oops;

interface Student1
{
     int a =5;
     void data();
}
class avi implements Student1
{
    public void data ()
    {
        String name="avinash";
        int rollNo = 68;
        System.out.println(name);
        System.out.println(rollNo);
    }
}
public class inter_face
{
    public static void main (String args [])
    {
        avi h= new avi();
        h.data();
    }
}

