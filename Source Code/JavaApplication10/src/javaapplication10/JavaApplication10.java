/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import javax.sound.sampled.*;

/**
 *
 * @author ardakc
 */
public class JavaApplication10 {    
    public static Integer durdur = 0;
    public static char durdurmatusu = '?';
    
    public static Integer saniye = 0;
    public static Integer dakika = 0;
    public static Integer saat = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        System.out.println("kcs-voice-recorder 1.0");
        System.out.println("ses kaydetmeyi başlatmak için 1 yazın.");
     
        System.out.print("seçim: ");
        java.util.Scanner anan = new java.util.Scanner(System.in);
        String getinput = anan.nextLine();
        System.out.print("ses dosyasını kaydetmek istediğiniz konumu yazın: ");
        java.util.Scanner anan2 = new java.util.Scanner(System.in);
        String dosyakonumu = anan2.nextLine();
        System.out.print("kayıtı durdurma tuşu belirle default (?): ");
        java.util.Scanner anan3 = new java.util.Scanner(System.in);
        String test = anan3.nextLine();
        System.out.println("mono mikrofon kullanıyorsanız   : 1");
        System.out.println("stereo mikrofon kullanıyorsanız : 2");
        System.out.print("secim: ");
        java.util.Scanner monoorstereo = new java.util.Scanner(System.in);
        Integer monoorstereoset = monoorstereo.nextInt();
        
        if(!test.equals("")) {
            durdurmatusu = test.charAt(0);
             System.out.println("durdurma tuşu (" + test + ") olarak ayarlandı!");
        }
        else {
            System.out.println("durdurma tuşu (?) olarak ayarlandı!");
        }
        if(getinput.equals("1")) {
            AudioFormat format = new AudioFormat(16000, 8, monoorstereoset, true,true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            final TargetDataLine veri = (TargetDataLine) AudioSystem.getLine(info);
            Listener.anan1();
            System.out.println("ses kayıtı alınıyor...");
            Timer sayacthread = new Timer();
            Thread sayacthread1 = new Thread(sayacthread);
             sayacthread1.start();
            while(!durdur.equals(1)) {
          
            veri.open();
            
            veri.start(); 
            
            }
            Thread kayıt = new Thread( new Runnable() {
                @Override
                public void run() {
                   AudioInputStream ses = new AudioInputStream(veri);
                   java.io.File dosya = new java.io.File(dosyakonumu);
                   try {
                       AudioSystem.write(ses, AudioFileFormat.Type.WAVE, dosya);
                   } catch (Exception e) {
                       System.out.println(e);
                   }
                   
                }
                
            });
            kayıt.start();
            Thread.sleep(1000);
            veri.stop();
            veri.close();
            sayacthread1.stop();
           
            System.out.println("ses dosyası belirlenen " + dosyakonumu + " yoluna kayıt edildi.");
            System.out.println("ses kayıtı sonlandırıldı.");
        }
      
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
    
}
