class cricketer extends player {
    private int totalruns;

    public void set_totalruns(int totalruns) {
        this.totalruns = totalruns;

    }

    public int gettotalruns() {
        return totalruns;

    }

    @Override
    public void players() {
        System.out.println("cricketer ameazing zing zingzing ");
    }

}
