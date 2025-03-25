public class Dough {
    private String flour;
    private String bakingSoda;
    private String water;
    private String yeast;

    public Dough(String flour, String bakingSoda, String water, String yeast) {
        setFlour(flour);
        setWater(water);
        setYeast(yeast);
       setBakingSoda(bakingSoda);
    }

    public String getFlour() {
        return flour;
    }

    private void setFlour(String flour) {
        this.flour = flour;
    }

    public String getBakingSoda() {
        return bakingSoda;
    }

    private void setBakingSoda(String bakingSoda) {
        this.bakingSoda = bakingSoda;
    }

    public String getWater() {
        return water;
    }

    private void setWater(String water) {
        if (water.equals("Hot water" ) || water.equals("Cold Water"))
        {
            this.water= water;//set
        }
        else
        {
            this.water ="Normal Water";// if
        }
    }

    public String getYeast() {
        return yeast;
    }

    private void setYeast(String yeast) {
        this.yeast = yeast;
    }
    public void mix ()
    {
        String ans = "Mixing " +flour +","+ water +"," + yeast +"," + bakingSoda;
        System.out.println(ans);
    }
    public void rest ()

    {
        System.out.println("Dough is resting");
    }
}
