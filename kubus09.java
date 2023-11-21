import java.util.Scanner;

/**
 * kubus09
 */
public class kubus09 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int s, vol, L;

        System.out.println("Masukkan panjang sisi: ");
        s = input09.nextInt();

        vol = s * s * s;
        System.out.println("Volume kubus adalah " + vol);

        L = 6 * s * s;
        System.out.println("Luas permukaan kubus adalah " + L);
        
        input09.close();
    }
}
