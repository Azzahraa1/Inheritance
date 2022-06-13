
package latihaninheritence;

public class BangunDatar {
    double luas;
    double a = 0.5;
    
    public void luas (double panjang, double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    public void luas (int panjang, int lebar, int a){
        luas = panjang*lebar*a;
        System.out.println("luas kedua = "+luas);
    }
    
}
