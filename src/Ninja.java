public class Ninja  extends Anime implements Printable{
    private int attack;
    private int chakra;


    public Ninja(String name, int age,int attack,int chakra) {
        super(name, age);
        this.attack = attack;
        this.chakra = chakra;
    }

    public int getAttack() {
        return attack;
    }



    public int getChakra() {
        return chakra;
    }

    @Override
    public String print() {
        return(getName()+" "+" "+getAge()+" "+getAttack()+" "+getChakra());
    }

}
