
package latihaninheritence2;

public class Hitung {

    public static void main(String[] args) {
       BangunDatar bangundatar = new BangunDatar();
          
       Persegi persegi = new Persegi();
       persegi.sisi=4;
       
       PersegiPanjang perjang = new PersegiPanjang();
       perjang.lebar= 5;
       perjang.panjang = 10;
       
       bangundatar.luas();
       bangundatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
       }
    }
    

