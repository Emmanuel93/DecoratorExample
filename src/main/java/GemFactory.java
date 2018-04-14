public class GemFactory {

    public static Character buildGem(Gems type, Character character){

        Character gem;

        switch (type){
            case DIAMOND:
                gem = new DiamondGem(character);
                break;
            case EMERALD:
                gem= new EmeraldGem(character);
                break;
            case ONIX:
                gem = new OnixGem(character);
                break;
            case RUBY:
                gem = new RubyGem(character);
                break;
            case ZAPHIRE:
                gem = new ZaphireGem(character);
                break;
            default:
                gem = new OnixGem(character);
                break;
        }

        return gem;
    }
}
