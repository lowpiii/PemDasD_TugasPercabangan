import java.util.Scanner;

public class PenilaianHurufMutu {
public static void main(String[] args){
        Scanner xyz = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai Anda: ");
        nilai = xyz.nextInt();

        if(nilai >= 85 && nilai <= 100){
            System.out.println("Nilai Anda: A");
        }else if(nilai >= 70 && nilai <= 84){
            System.out.println("Nilai Anda: B");
        }else if(nilai >= 55 && nilai <= 69){
            System.out.println("Nilai Anda: C");
        }else if(nilai >= 40 && nilai <= 54){ 
            System.out.println("Nilai Anda: D");
        }else if(nilai >= 0 && nilai < 40){ 
            System.out.println("Nilai Anda: E");
        }else{ 
            System.out.println("Input tidak valid. Silakan masukkan nilai (1-100).");
        }

}
}



