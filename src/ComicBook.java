public class ComicBook extends Book{

    private String characterName;

    @Override
    public double getPrice() {
        System.out.println("Price with 60% off : "+0.4*super.getPrice());
        return 0.4*super.getPrice();
    }

    public double getPrice(double percentage){
        System.out.println("Price with "+percentage+"% off : "+((100-percentage)/100)*super.getPrice());
        return super.getPrice()*((100-percentage)/100);
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
