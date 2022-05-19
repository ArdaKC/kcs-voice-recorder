/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
/**
 *
 * @author ardakc
 */
public class Listener implements NativeKeyListener  {
    char anan;
    public static void anan1() {
     try {
          GlobalScreen.registerNativeHook();
      } catch (NativeHookException e) {
          System.out.println(e);
      }
      GlobalScreen.addNativeKeyListener(new Listener());
    }
    @Override
    public void nativeKeyTyped(NativeKeyEvent rocco) {
 
        anan = rocco.getKeyChar();
        if(anan == JavaApplication10.durdurmatusu) {
           JavaApplication10.durdur = 1;
          
           
        }
    }
}