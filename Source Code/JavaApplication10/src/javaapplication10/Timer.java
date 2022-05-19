/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import static javaapplication10.JavaApplication10.dakika;
import static javaapplication10.JavaApplication10.saat;
import static javaapplication10.JavaApplication10.saniye;

/**
 *
 * @author ardakc
 */
public class Timer extends Thread {
    @Override
    public void run() {
        while(true) {
            try {
             if(!saniye.equals(60)) {
                saniye++;
            }
            else {
                if(!dakika.equals(60)) {
                      dakika++;
                saniye = 0;
                }
                else {
                    saat++;
                    saniye=0;
                    dakika=0;
                }
              
            }
          
            System.out.println(saat + " : " + dakika + " : " + saniye);
            Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
      
        }
    }
    
}
