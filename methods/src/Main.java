
public class Main {

    public static void sayıbulmaca() {
        int[] sayılar = {1, 2, 5, 7, 9, 0};
        int aranacak = 6;

        boolean isThere = false;

        for (int sayı : sayılar) {
            if (aranacak == sayı) {
                isThere = true;
                break;
            }
        }
        if (isThere == true) {
            mesajVer("Sayı mevcut : "+aranacak);
        } else {
            mesajVer("Sayı mevcut değildir :"+aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

    public static void main(String[] args) {
        sayıbulmaca();
    }

}
