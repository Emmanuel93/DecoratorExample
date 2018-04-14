public class GemFactory {

    public static Character buildGem(Gems type){

        Character gem;

        switch (type){
            case DIAMOND:
                gem = new DiamondGem();
                break;
            case EMERALD:
                gem= new EmeraldGem();
                break;
            case ONIX:
                gem = new OnixGem();
                break;
            case RUBY:
                gem = new RubyGem();
                break;
            case ZAPHIRE:
                gem = new ZaphireGem();
                break;
            default:
                gem = new OnixGem();
                break;
        }

        return gem;
    }
}
