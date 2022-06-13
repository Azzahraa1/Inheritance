
package lat1_inheritence;

public class Anak extends Ayah{
    double nilaimax = 99.9;
    String nama = "Rara";
    int age =15;
    public void cetak (){
        System.out.println("Anak ini memiliki sifat :"+super.Sifat);
        System.out.println("Yang bernama:"+ nama);
        System.out.println("Berumur : "+age);
        System.out.println("Dengan tinggi badan:" + super.TB);
        super.hobi();
    }
    
}
