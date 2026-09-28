import java.util.Scanner;

public class StatusMember {
public static void main(String[] args){
        Scanner jkl = new Scanner(System.in);
        String member;

        System.out.print("Masukkan jenis member Anda: ");
        member = jkl.nextLine();

        if ("GOLD".equals(member)){
            System.out.println("Diskon 20%");
        }else if ("SILVER".equals(member)){
            System.out.println("Diskon 15%");
        }else if ("BRONZE".equals(member)){
            System.out.println("Diskon 10%");
        }else{ 
            System.out.println("Tidak ada diskon (0%)");
        }

}
}



