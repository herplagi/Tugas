public class Parent {
    int x = 5;
    public void Info(){
        System.out.println("Ini Class Parent");

    }

}
class Child Extends Parent{
    int x = 10;
    /**
     * System.out.println("Menyusun Pegawai "); --> karena ada string yg dibuat
        pada constructor superclass,maka akan menjadi referensi bagi subclass yaitu
        class gaji.Maka ini dinamakan
        dengan DOWNCASTING
     */
    public void Info(){
        System.out.println("Ini class Child");
        
    }
}
class Tes{
    public static void main(String[] args) {
        Parent Tes = new Child();
        System.out.println("Nilai x = " +Tes.x);
        Tes.Info();
        
    }
}
