
package LECTURE6;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        System.out.println("Hay nhap ky tu muon dem: ");
        char o = vao.next().charAt(0) ;
        int dem=0;
        for(int i=0; i< chuoi.length();i++){
            if(chuoi.charAt(i)==o){
                dem++;
            }
        }
        System.out.println("So y tu "+ o +" cua chuoi la: "+dem);
    }
}
