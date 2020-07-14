package com.tute.part1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//Below is the syntax highlighted version of Average.java.


/******************************************************************************
 *  Compilation:  javac Average.java
 *  Execution:    java Average < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a sequence of real numbers, and computes their average.
 *
 *  % java Average
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  [Ctrl-d]
 *  Average is 10.5
 *
 *  Note [Ctrl-d] signifies the end of file on Unix.
 *  On windows use [Ctrl-z].
 *
 ******************************************************************************/


/**
 *  The {@code Average} class provides a client for reading in a sequence
 *  of real numbers and printing out their average.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class Average { 

    // this class should not be instantiated
    private Average() { }

    /**
     * Reads in a sequence of real numbers from standard input and prints
     * out their average to standard output.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) { 
        int count = 0;       // number input values
        double sum = 0.0;    // sum of input values

        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        // compute the average
        double average = sum / count;

        // print results
        StdOut.println("Average is " + average);
    }
}

/******************************************************************************
 *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/


//Cat.java
//
//Below is the syntax highlighted version of Cat.java.
//
//
///******************************************************************************
// *  Compilation:  javac Cat.java
// *  Execution:    java Cat input0.txt input1.txt ... output.txt
// *  Dependencies: In.java Out.java
// *  Data files:   https://algs4.cs.princeton.edu/11model/in1.txt
// *                https://algs4.cs.princeton.edu/11model/in2.txt
// *
// *  Reads in text files specified as the first command-line
// *  arguments, concatenates them, and writes the result to
// *  filename specified as the last command-line arguments.
// *
// *  % more in1.txt
// *  This is
// *
// *  % more in2.txt
// *  a tiny
// *  test.
// *
// *  % java Cat in1.txt in2.txt out.txt
// *
// *  % more out.txt
// *  This is
// *  a tiny
// *  test.
// *
// ******************************************************************************/
//
//package edu.princeton.cs.algs4;
//
///**
// *  The {@code Cat} class provides a client for concatenating the results
// *  of several text files.
// *  <p>
// *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
// *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
// *
// *  @author Robert Sedgewick
// *  @author Kevin Wayne
// */
//public class Cat {
//
//    // this class should not be instantiated
//    private Cat() { }
//
//    /**
//     * Reads in a sequence of text files specified as the first command-line
//     * arguments, concatenates them, and writes the results to the file
//     * specified as the last command-line argument.
//     *
//     * @param args the command-line arguments
//     */
//    public static void main(String[] args) {
//        Out out = new Out(args[args.length - 1]);
//        for (int i = 0; i < args.length - 1; i++) {
//            In in = new In(args[i]);
//            String s = in.readAll();
//            out.println(s);
//            in.close();
//        }
//        out.close();
//    }
//
//}
//
///******************************************************************************
// *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
// *
// *  This file is part of algs4.jar, which accompanies the textbook
// *
// *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
// *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
// *      http://algs4.cs.princeton.edu
// *
// *
// *  algs4.jar is free software: you can redistribute it and/or modify
// *  it under the terms of the GNU General Public License as published by
// *  the Free Software Foundation, either version 3 of the License, or
// *  (at your option) any later version.
// *
// *  algs4.jar is distributed in the hope that it will be useful,
// *  but WITHOUT ANY WARRANTY; without even the implied warranty of
// *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// *  GNU General Public License for more details.
// *
// *  You should have received a copy of the GNU General Public License
// *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
// ******************************************************************************/
//
//
//Last updated: Fri Jun 26 13:09:34 EDT 2020.Last updated: Fri Jun 26 13:09:34 EDT 2020.