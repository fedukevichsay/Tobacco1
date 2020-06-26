package lab.Factory;

public class CigaretteFactory {
    public Cigarettes getCigarettes(CigarettesTypes type) {
        Cigarettes toReturn = null;
        switch (type) {
            case XSBLUE:
                toReturn = new WinstonXSblue();
                break;
            case XSSILVER:
                toReturn = new WinstonXSsilver();
                break;
            case XSTYLE:
                toReturn = new WinstonXStyle();
                break;
            default:
                throw new IllegalArgumentException("Wrong cigarette type:" + type);
        }
        return toReturn;
    }
}
