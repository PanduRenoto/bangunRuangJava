package inheritance2;

import java.util.Scanner;

public class Inheritance2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Halooo");
        System.out.println("1. Kubus");
        System.out.println("2. Bola");
        System.out.println("3. Balok");
        System.out.println("4. Limas");
        System.out.print("Mau ngitung apa? ");
        
        int pilih = input.nextInt();
        
        bangunRuang BangunRuang = new bangunRuang();
        
        switch(pilih) {
            case 1:
            kubus Kubus = new kubus();
            Kubus.inputData();
            Kubus.luasPermukaan();
            Kubus.volume();
            break;
            
            case 2:
            bola Bola = new bola();
            Bola.inputData();
            Bola.luasPermukaan();
            Bola.volume();
            break;
            
            case 3:
            balok Balok = new balok();
            Balok.inputData();
            Balok.luasPermukaan();
            Balok.volume();
            break;
            
            case 4:
            limas Limas = new limas();
            Limas.inputData();
            Limas.luasPermukaan();
            Limas.volume();
            break;
            
            default: System.out.println("Salah ygy");
        }

    }
    
}
