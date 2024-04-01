package AbstrackBirdFly;

public abstract class bird implements Flaybal{
    
    private final String breed;

    public bird(String breed) {
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }
    

    
}
