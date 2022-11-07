public class Asdos extends Mahasiswa{
    private int jamNgasDos;

    Asdos (String nama, int SKS, int jamNgasDos){
        super(nama, SKS);
        jamSibuk = jamSibuk + jamNgasDos;

    }
    public int getJamSibuk(){
        return jamSibuk;

    }
    void kirim(){
        System.out.println(getNama()+"adalah seorang asdos dengan jam sibuk"+getJamSibuk());
    }
}
