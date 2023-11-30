/**
 * Driver code for Project 3
 *
 * @author rbk
 */

// Change to your net id
package MDS;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P3Driver {
    public static void main(String[] args) throws Exception {
        Scanner in;
        if (args.length > 0 && !args[0].equals("-")) {
            File file = new File(args[0]);
            in = new Scanner(file);
        } else {
            in = new Scanner(System.in);
        }
        int i = 0;
        for(; i<=5; i++){
            // /Users/sahuankit010/Desktop/Repo/CS-3345/CS-3345-projects/src/main/java/p3-testcascases t0-t5/p3-t0.txt
            String st = "/Users/sahuankit010/Desktop/Repo/CS-3345/CS-3345-projects/src/main/java/p3-testcascases t0-t5/p3-t" + i + ".txt";

            File inputFile = new File(st);

            in = new Scanner(inputFile);

            boolean VERBOSE = false;
            if (args.length > 1) {
                VERBOSE = Boolean.parseBoolean(args[1]);
            }

            String operation = "";
            int lineno = 0;

            MDS mds = new MDS();
            Timer timer = new Timer();
            int id, result, total = 0, price;
            List<Integer> name = new LinkedList<>();

            whileloop:
            while (in.hasNext()) {
                lineno++;
                result = 0;
                operation = in.next();
                if (operation.charAt(0) == '#') {
                    in.nextLine();
                    continue;
                }
                switch (operation) {
                    case "End":
                        break whileloop;
                    case "Insert":
                        id = in.nextInt();
                        price = in.nextInt();
                        name.clear();
                        while (true) {
                            int val = in.nextInt();
                            if (val == 0) {
                                break;
                            } else {
                                name.add(val);
                            }
                        }
                        result = mds.insert(id, price, name);
                        break;
                    case "Find":
                        id = in.nextInt();
                        result = mds.find(id);
                        break;
                    case "Delete":
                        id = in.nextInt();
                        result = mds.delete(id);
                        break;
                    case "FindMinPrice":
                        result = mds.findMinPrice(in.nextInt());
                        break;
                    case "FindMaxPrice":
                        result = mds.findMaxPrice(in.nextInt());
                        break;
                    case "FindPriceRange":
                        result = mds.findPriceRange(in.nextInt(), in.nextInt(), in.nextInt());
                        break;
                    case "RemoveNames":
                        id = in.nextInt();
                        name.clear();
                        while (true) {
                            int val = in.nextInt();
                            if (val == 0) {
                                break;
                            } else {
                                name.add(val);
                            }
                        }
                        result = mds.removeNames(id, name);
                        break;
                    default:
                        System.out.println("Unknown operation: " + operation);
                }
                total += result;
                if (VERBOSE) {
                    System.out.println(lineno + "\t" + operation + "\t" + result + "\t" + total);
                }
            }

            System.out.println("test case " + i + "\n" + total);
            System.out.println(timer.end());
        }

    }

    public static class Timer {
        long startTime, endTime, elapsedTime, memAvailable, memUsed;

        public Timer() {
            startTime = System.currentTimeMillis();
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public Timer end() {
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            memAvailable = Runtime.getRuntime().totalMemory();
            memUsed = memAvailable - Runtime.getRuntime().freeMemory();
            return this;
        }

        public String toString() {
            return "Time: " + elapsedTime + " msec.\n" + "Memory: " + (memUsed / 1048576) + " MB / " + (memAvailable / 1048576) + " MB.";
        }
    }
}
