public class Mahasiswa extends  Elemen{
    private int SKS;
    public int jamSibuk;

    public Mahasiswa(String nama, int SKS){
        super(nama);
        jamSibuk = SKS*3;
        
    }
    public int SKS(){
        return SKS;

    }
    @Override
    void kirim(){
        System.out.println(getNama()+"adalah seorang mahasiswa dengan jam sibuk"+ getJamSibuk());

    }
    @Override
    public int getJamSibuk(){
        return jamSibuk;
    }



}
