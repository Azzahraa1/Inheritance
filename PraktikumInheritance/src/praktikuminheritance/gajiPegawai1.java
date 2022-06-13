 
package praktikuminheritance;

public class gajiPegawai1 {
 int gaji;
 
 void gaji (int a, int b){
     gaji = a*b;
    
     System.out.println("Gaji utama yang di dapat :"+gaji +"00000");
     
 }
 void gaji (double a, double b, double c){
     gaji = (int) (a*b*c);
     System.out.println("Gaji yang didapat jika bekerja secara baik menjadi :"+gaji + "00000");
 }
}
