/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.java.testconcepts.interfaces.Java8Interface;
import sun.awt.X11.XConstants;

/**
 *
 * @author vagrant
 */
public class TestInterface implements Java8Interface{
    void testTheValue(){
        System.out.println("The Default Value of the Interface Object: "+Java8Interface.TESTINTEGER);
    }
    
    public static void main(String[] args) {
        TestInterface face = new TestInterface();
        System.out.println("THis is the change");
        System.out.println("THis is another Line2");
        System.out.println("THis is third Libne");
    }
}
