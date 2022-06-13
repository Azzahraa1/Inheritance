
package praktikuminheritance;

public class hasil {

    public static void main(String[] args) {
      identitasPegawai2 identitaspegawai = new identitasPegawai2();
      identitaspegawai.cetak();
      identitaspegawai.identitas();
      identitaspegawai.setnomorpegawai(333333);
      identitaspegawai.nomorpegawai();
      
      gajiPegawai1 gaji = new gajiPegawai1();
      System.out.println("Bekerja di bagian admin");
      gaji.gaji(6,2);
      gaji.gaji(6,2,2);
    }
    
}
