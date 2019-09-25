public class Team7 extends Konoha implements Printable {
    private String ability;

    public Team7(String name, int age, int attack, int chakra, String clan, String status, String ability) {
        super(name, age, attack, chakra, clan, status);
        this.ability = ability;
    }
    public String getAbility() {
        return ability;
    }
    @Override
    public String print() {
        return (super.print()+"  "+getAbility());
    }
}
