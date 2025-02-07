
package LECTURE6;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        for(int i=chuoi.length()-1; i>=0;i--){
            System.out.print(chuoi.charAt(i));
        }
    }
}
