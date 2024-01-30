package inheritance2;

import java.util.Scanner;

public class kubus extends bangunRuang {
    float s;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        s = input.nextFloat();
    }
    
    @Override
    float luasPermukaan() {
        float luasPermukaan = 6 * (s * s);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        return luasPermukaan;
    }
    
    @Override
    float volume(){
        float volume = s * s * s;
        System.out.println("Volume Kubus: " + volume);
        return volume;
    }
}
