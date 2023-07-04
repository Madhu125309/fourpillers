public class playerdemo {

    public static void main(String[] args) {
        cricketer c = new cricketer();
        c.set_jersey_id(1);
        c.set_name("madhu");
        c.set_country_name("india");
        c.set_totalruns(1000);

        System.out.println("jersey id is:" + c.getjersey_id());
        System.out.println("cricketer name is:" + c.getname());
        System.out.println("cricketer country name:" + c.getcountry_name());
        System.out.println("total runs:" + c.gettotalruns());
        c.players();

        footballplayer f = new footballplayer();
        f.set_jersey_id(5);
        f.set_name("sai");
        f.set_country_name("india");
        f.set_totalgoals(100);
        System.out.println("jersey id is:" + f.getjersey_id());
        System.out.println("football player name is:" + f.getname());
        System.out.println("football player country name:" + f.getcountry_name());
        System.out.println("total goals" + f.gettotalgoals());

        c.players();
        System.out.println();

        System.out.println();
    }
}