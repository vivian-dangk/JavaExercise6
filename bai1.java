
package LECTURE6;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        int dem=0;
        for(int i=0; i< chuoi.length();i++){
            dem++;
        }
        System.out.println("Ky tu cua chuoi la: "+dem);
    }
}
