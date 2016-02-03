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
public class ex2 {
    
    public static void main(String[] args) {
        Even Even = new Even();
        
        T1 t1 = new T1(Even);
        T1 t2 = new T1(Even);
        
        t1.start();
        t2.start();
        
//        Counter count = new Counter();
//        
//        CT ct = new CT(count);
//        CT ct2 = new CT(count);
//        ct2.start();
//        ct.start();
        
    }
}
