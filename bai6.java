
package LECTURE6;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        System.out.println("Nhap tu can doi: ");
        String o=vao.nextLine();
        System.out.println("Nhap tu doi: ");
        String a=vao.nextLine();
        System.out.println("Chuoi thay the la: "+chuoi.replace(o, a));
    }
}
