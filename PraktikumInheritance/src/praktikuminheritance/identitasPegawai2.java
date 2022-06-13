
package praktikuminheritance;

public class identitasPegawai2 extends identitasPegawai{
    String jeniskelamin;
    int nomorpegawai;
    
    public void identitas(){
        jeniskelamin = "Perempuan";
        System.out.println("Jenis Kelamin :"+jeniskelamin);
    }
    public void setnomorpegawai(int nomorpegawai){
        this.nomorpegawai = nomorpegawai;
    }
    public void cetak(){
        super.identitas();
    }
    public void nomorpegawai(){
        System.out.println("Nomor Pegawai :"+nomorpegawai);
    }
}
