import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int pilihan_menu;
        String member, qris;
        double diskon, harga, total_harga;
        
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input26.nextInt();
        input26.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input26.nextLine();
        System.out.print("Apakah menggunakan QRIS (y/n) ? = ");
        qris = input26.nextLine();
        System.out.println("--------------------------------------");

        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if(pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if(pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if(pilihan_menu==3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_harga = harga - (diskon*harga);
            if(qris.equalsIgnoreCase("y")){
                total_harga-=1000;
                System.out.println("Total bayar setelah diskon = " + total_harga);
            }else if(qris.equalsIgnoreCase("n")){
                System.out.println("Total bayar setelah diskon = " + total_harga);
            }else{
                System.out.println("Pemilihan QRIS tidak valid");
            }
        }else if(member.equalsIgnoreCase("n")){
            if(pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if(pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if(pilihan_menu==3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            if(qris.equalsIgnoreCase("y")){
                harga-=1000;
                System.out.println("Total bayar setelah diskon = " + harga);
            }else if(qris.equalsIgnoreCase("n")){
                System.out.println("Total bayar setelah diskon = " + harga);
            }else{
                System.out.println("Pemilihan QRIS tidak valid");
            }
        }else{
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}