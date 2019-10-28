package latihan1;
public class Latihan1 {
    public static void main(String[] args) {
        //instansiasi dari Latihan1 mahasiswa
        mahasiswa mhs_yani = new mahasiswa();
        mhs_yani.alamat="Sumengko";//akses variabel
        System.out.println("alamat mahasiswa yani : "+mhs_yani.alamat);
        mhs_yani.nim="2120180155";
        System.out.println("nim mahasiswa yani : "+mhs_yani.nim);
        
        mahasiswa mhs_erlinda = new mahasiswa();
        mhs_erlinda.alamat="Sukorejo";//akses variabel
        System.out.println("alamat mahasiswa erlinda : "+mhs_erlinda.alamat);
        mhs_erlinda.nim="2120180149";
        System.out.println("nim mahasiswa erlinda : "+mhs_erlinda.nim);
        
        mahasiswa mhs_liyak = new mahasiswa();
        mhs_liyak.alamat="Dander";//akses variabel
        System.out.println("alamat mahasiswa liyak : "+mhs_liyak.alamat);
        mhs_liyak.nim="2120180165";
        System.out.println("nim mahasiswa liyak : "+mhs_liyak.nim);
        
        mahasiswa mhs_indah = new mahasiswa();
        mhs_indah.alamat="Kunci";//akses variabel
        System.out.println("alamat mahasiswa indah : "+mhs_indah.alamat);
        mhs_indah.nim="2120180159";
        System.out.println("nim mahasiswa indah : "+mhs_indah.nim);
        
        mahasiswa mhs_diah = new mahasiswa();
        mhs_diah.alamat="Trucuk";//akses variabel
        System.out.println("alamat mahasiswa diah : "+mhs_diah.alamat);
        mhs_diah.nim="2120180140";
        System.out.println("nim mahasiswa diah : "+mhs_diah.nim);
    }
}
