public class Team7 extends Anime implements Printable {
    private String ability;


    public Team7(String ability) {
        setName("Команда: номер 7");
    this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }
    @Override
    public void print() {
        System.out.println(getName()+"\n"+"Способность: "+getAbility());
    }
}
