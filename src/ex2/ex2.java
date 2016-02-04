/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class ex2 {
    
    public static void main(String[] args) {
        Even Even = new Even();
        
        List<T1> l = new ArrayList();
        
        for (int i = 0; i < 100; i++) {
            l.add(new T1(Even));
        }
        
        for (T1 l1 : l) {
            l1.start();
        }
        
        
//        Counter count = new Counter();
//        
//        CT ct = new CT(count);
//        CT ct2 = new CT(count);
//        ct2.start();
//        ct.start();
        
    }
}
