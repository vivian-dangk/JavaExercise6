
package LECTURE6;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        for(int i=0; i< chuoi.length();i++){
            if(Character.isDigit(chuoi.charAt(i))){
                System.out.print(chuoi.charAt(i));
            }
        }
    }
}
