public class Dosen extends Elemen{
    private int jumlahHariKerja;
    public int jamSibuk;

    public Dosen (String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja* 8;

    }
    @Override
    void kirim(){
        System.out.println(getNama()+"adalah seorang dosen dengan jam sibuk"+getJamSibuk());
    }
    int jamSibuk(){
        return jamSibuk;

    }   

}
