
package LECTURE6;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        String chuoi = vao.nextLine();
        int dem=0;
        boolean tu=false;
        for(int i=0; i< chuoi.length();i++){
            if(chuoi.charAt(i)!=' '){
                if(!tu){
                    dem++;
                    tu=true;
                }
            }else{
                tu=false;
            } 
        }
        System.out.println("Tu cua chuoi la: "+dem);
    }
}
