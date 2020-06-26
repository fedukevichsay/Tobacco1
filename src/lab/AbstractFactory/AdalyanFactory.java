package lab.AbstractFactory;

public class AdalyanFactory implements HookahTobaccoAbsFactory {
    @Override
    public Hard createHard() {
        return new AdalyanHard();
    }

    @Override
    public Light createLight() {
        return new AdalyanLight();
    }
}
