public class Konoha extends Ninja implements Printable{
    private String clan;
    private String status;

    public Konoha(String name, int age, int attack, int chakra, String clan, String status) {
        super(name, age, attack, chakra);
        this.clan = clan;
        this.status = status;
    }
    public String getClan() {
        return clan;
    }
    public String getStatus() {
        return status;
    }
    @Override
    public String print() {
        return (super.print()+" "+getClan()+" "+getStatus());
    }
}
