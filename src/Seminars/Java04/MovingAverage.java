package Seminars.Java04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/moving-average-from-data-stream/
 */


/**
 * 1. Очередь (FIFO, first in first out, первый вошел, первый вышел)
 * в обходе деревьев (поиск в ширину)
 * поиск в ширину - поиск кратчайшего пути
 * моделировать очередь
 **/

public class MovingAverage {

    static Queue<Integer> q = new LinkedList<>();
    // интерфейс
    // контракт
    static int windowSize;
    static double sum;


    public MovingAverage(int size) {
        windowSize = size;
        sum = 0;
    }

    public double next(int val) {
        sum += val;
        q.add(val);
        if (q.size() > windowSize) {
            sum -= q.poll();
        }
        return sum / q.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        double param_1 = movingAverage.next(1);
        double param_2 = movingAverage.next(10);
        double param_3 = movingAverage.next(3);
        double param_4 = movingAverage.next(5);
        System.out.println(param_1 + " " + param_2 + " " + param_3 + " " + param_4);

    }

}

