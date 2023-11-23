import java.util.Scanner;

/**
 * kubus09
 */
public class kubus09 {
    static int HitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    static int HitungLuasPermukaan (int s){
        int LP = 6*s*s;
        return LP;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int s, vol, LP;

        System.out.println("Masukkan panjang sisi: ");
        s = input09.nextInt();

        vol = s * s * s;
        System.out.println("Volume kubus adalah " + vol);

        LP = 6 * s * s;
        System.out.println("Luas permukaan kubus adalah " + LP);
        
        input09.close();
    }
}
