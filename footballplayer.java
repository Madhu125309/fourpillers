class footballplayer extends player {
    private int totalgoals;

    public void set_totalgoals(int totalgoals) {
        this.totalgoals = totalgoals;
    }

    public int gettotalgoals() {
        return totalgoals;
    }

    @Override
    public void players() {

        System.out.println("football amezing zing zing zing");

    }

}
