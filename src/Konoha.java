public class Konoha extends Anime implements Printable{
    private String clan;
    private String status;


    public Konoha(String clan, String status) {
        setName("Деревня: Коноха");
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
        return "\n"+"Название клана: "+getClan()+"\n"+"Звание: "+getStatus();
    }
}
