/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author David
 */
public class Counter {

    private int c = 0;

    public synchronized void increment() {
        int result = c;
        result++;
        c = result;
    }

    public int value() {
        return c;
    }
}
