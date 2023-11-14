import java.util.Scanner;
public class bb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("gender anda : (masukkan wanita/pria)");
        String gender = sc.nextLine();
        System.out.println("masukkan tinggi badan anda : ");
        int tinggiBadan = sc.nextInt();
        
        float persen = 0.15f;
        float persen2 = 0.1f;
        float beratBadanWanita = tinggiBadan - 100 ;
        float wanita1 = beratBadanWanita * persen;
        float wanitaIdeal = beratBadanWanita - wanita1;
        float beratBadanPria = tinggiBadan - 100 ;
        float pria1 = beratBadanPria * persen2;
        float priaIdeal = beratBadanPria - pria1;

        String wanita = "wanita";
        String pria = "pria";

       if(gender.equals(wanita)){
        System.out.println("Berat badan ideal anda sebagai wanita adalah ... " + wanitaIdeal);
       } 
       else if(gender.equals(pria)){
        System.out.println("Berat badan ideal anda sebagai pria adalah ... " + priaIdeal);

       }
       else{
        System.out.println("gender yang anda masukkan salah");
       }
       sc.close();
    }
}