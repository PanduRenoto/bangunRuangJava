package inheritance2;

import java.util.Scanner;

public class limas extends bangunRuang{
     float a;
     float t;
     float t1;
     float st;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        a = input.nextFloat();
        System.out.print("Masukkan tinggi: ");
        t = input.nextFloat();
        System.out.print("Masukkan tinggi alas: ");
        t1 = input.nextFloat();
        System.out.print("Masukkan luas sisi tegak: ");
        st = input.nextFloat();
    }
    
    @Override
    float luasPermukaan() {
        float luasPermukaan = (a * t1 / 2) + (3 * st);
        System.out.println("Luas Permukaan Limas: " + luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume(){
        float volume = (a * t1 / 2) * t / 3;
        System.out.println("Volume Limas: " + volume);
        return volume;
    }
}
