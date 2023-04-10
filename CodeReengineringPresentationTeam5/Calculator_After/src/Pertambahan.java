public class Pertambahan implements Operation{
    Integer a;
    Integer b;

    public Pertambahan(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        Integer result = a+b;
        System.out.println(result.toString());
    }
    @Override
    public String GetName() {
        // TODO Auto-generated method stub
        return "Anda memilih Pertambahan dan hasilnya adalah ";
    }
}
