public  class Main {

    public static void main(String[] args) {
        createObject("Ninja");
        System.out.println("__________________");
        createObject("Konoha");
        System.out.println("___________________");
        createObject("Team7");
        System.out.println("___________________");

    }
    public static String createObject(String className) {
        switch (className){
            case "Ninja":
                Ninja n1 = new Ninja(70,120);
                System.out.println(n1.print());
                break;
            case "Konoha":
                Konoha k1 =new Konoha("Uzumaki","Genin");
                System.out.println(k1.getName()+k1.print());
                break;
            case  "Team7":
                Team7 t7= new Team7("UseChakra");
                System.out.println(t7.getName()+t7.print());
                break;
        }return className;
    }
}











//        Team7 t = new Team7("name",2,7,3,"clan" ,"status","ability ");
//        System.out.println(t.print());
//        System.out.println("_____________________________");