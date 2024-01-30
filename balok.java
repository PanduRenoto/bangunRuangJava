package inheritance2;

import java.util.Scanner;

public class balok extends bangunRuang{
     float p;
     float l;
     float t;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        p = input.nextFloat();
        System.out.print("Masukkan lebar: ");
        l = input.nextFloat();
        System.out.print("Masukkan tinggi: ");
        t = input.nextFloat();
    }
    
    @Override
    float luasPermukaan() {
        float luasPermukaan = 2 * (p * l + p * t + l * t);
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume(){
        float volume = p * l * t;
        System.out.println("Volume Balok: " + volume);
        return volume;
        }
}
