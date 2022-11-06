public class Gaji extends Pegawai{
    // extends syarat untuk pewarisan dari superclass ke subclass

    private double salary;
    public Gaji(String name, String address, int number, double salary){
        super(name, address,number);
        setSalary(salary);

    }
    public void mailCheck(){
        // method mailCheck adalah metod yang dimiliki subclassyaitu pegawai yang mana terjadi overriding karna memiliki nama yang sama dengan mehod yang ada pada superclass. karena pada subclass ini mengubah isinya dengan atau refrensinya yang mana bukan lagi ber refrensi pada superclass. hal ini dinamakan upcasting

        System.out.println("Memeriksa Kelas Gaji dalam surat");;
        System.out.println("Surat ditujukan untuk saudara"+ getName()+ "dengan gaji" + salary);;

    }
    public double getSalary(){
        return salary;

    }
    public void setSalary(double newSalary){
        if (newSalary >= 0.0){
            salary = newSalary;

        }
    }
    public double computerPay(){
        System.out.println("menghitung Pembayaran Gaji untuk " + getName());
        return salary / 52;
    }


}
