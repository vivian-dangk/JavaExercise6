
package LECTURE6;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        System.out.println(chuoi.trim().replaceAll("\\s+", " "));
    }  
}
