public class Ninja  extends Anime implements Printable{
    private int attack;
    private int chakra;


    public Ninja(int attack,int chakra) {
        setName("Нинздзя");
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
    public void print() {
        System.out.println( "Имя:"+getName()+"\n"+ "Атака:"+getAttack()+"\n" + "Чакра: "+getChakra());
    }

}
