abstract class player {
    private int jersey_id;
    private String name;
    private String country_name;

    public abstract void players();

    public void set_jersey_id(int jersey_id) {
        this.jersey_id = jersey_id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_country_name(String country_name) {
        this.country_name = country_name;
    }

    public int getjersey_id() {
        return jersey_id;
    }

    public String getname() {
        return name;
    }

    public String getcountry_name() {
        return country_name;
    }

    /*
     * @Override
     * public String toString() {
     * return "jersey_id:" + jersey_id + "name:" + name + "country_name" +
     * "country_name";
     * }
     */

}
