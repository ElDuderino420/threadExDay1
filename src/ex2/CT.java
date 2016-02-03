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
public class CT extends Thread{
    
    private Counter c;

    public CT(Counter c) {
        this.c = c;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 1000000; i++) {
            c.increment();
        }
        System.out.println(c.value());
    }
    
}
