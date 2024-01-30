package inheritance2;

import java.util.Scanner;

public class bola extends bangunRuang{
     float r;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        r = input.nextFloat();
    }
    
    @Override
    float luasPermukaan() {
        float luasPermukaan = (float) (4 * Math.PI * r * r);
        System.out.println("Luas Permukaan Bola: " + luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume(){
        float volume = (float) (Math.PI * r * r * r * 4 / 3);
        System.out.println("Volume Bola: " + volume);
        return volume;
    }
}
