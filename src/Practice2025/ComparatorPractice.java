package Practice2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ComparatorPractice {

    static class Pair{
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        int getX(){
            return this.x;
        }

        int getY(){
            return this.y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class Student{
        int marks;
        String name;

        Student(int marks, String name){
            this.marks = marks;
            this.name = name;
        }

        int getMarks(){
            return this.marks;
        }

        String getName(){
            return this.name;
        }

        @Override
        public String toString(){
            return "Name = " + getName() + ", Marks = " + getMarks() + "\n";
        }
    }

    public static void main(String[] args) {

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(90, "Ankit"));
        stu.add(new Student(95, "Rohin"));
        stu.add(new Student(96, "Sarang"));
        stu.add(new Student(90, "Paras"));
        System.out.println("Before Sorting \n" + stu);

        stu.sort((a, b) -> {
            if(a.getMarks() != b.getMarks()){
                return b.getMarks() - a.getMarks();
            }
            return a.getName().compareTo(b.getName());
        });

        System.out.println("After Sorting:\n" + stu);

        String str = "ankit";

        List<Character> li = new ArrayList<>();
        System.out.println(str);
        for (char c : str.toCharArray()) {
            li.add(c);
        }

        li.sort((a,b)-> Character.compare(a, b));

        StringBuilder sortedStr = new StringBuilder();
        for (char c : li) {
            sortedStr.append(c);
        }

        System.out.println(sortedStr.toString());

        /*
        Sorting Pairs
        List<Pair> p = new ArrayList<>();
        p.add(new Pair(95, 9));
        p.add(new Pair(1, 10));
        p.add(new Pair(5, 4));

        p.add(new Pair(2, 50));

        System.out.println("before sorting pairs " + p);
        p.sort((a, b) -> {
            if(a.getX() != b.getX()) return a.getX() - b.getX();
            return a.getY() - b.getY();
        });

        System.out.println("After sorting pairs " + p);

         */

        /*
        List of integers
        Integer[] arr = {2, 6, 3, 56, 100, 4};
        List<Integer> list = Arrays.asList(arr);

        System.out.println("Before Sorting: "+ list);

        list.sort((a, b) -> (b-a));

        System.out.println("After Sorting: "+ list);
         */


    }
}
