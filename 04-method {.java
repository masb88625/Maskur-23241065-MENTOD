Class Mahasiswa {
    // Data Member atau ciri
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method dengan parameter dan tanpa return
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    
    String getNIM(){
        return this.NIM;
    }

    // method dengan parameter dan return
    String syHi(String pesan){
        return "Hi.." + this.nama + pesan
    }

}



public class APP {
    Run|Debug
    public static void main(String[] args) throws Exception

       // membuat objek
       Mahasiswa mhs_1 = new Mahasiswa(nama:"Adam",
       NIM:"123456789");

       // memanggil method tanpa parameter dan return
       mhs_1.cetak();

       // memanggil method dengan return tanpa return
       mhs_1.setNama(nama:"Ucup");
       mhs_1.cetak();

       // memanggil method dengan return tanpa parameter



