package lab.AbstractFactory;

public class HookafinFactory implements HookahTobaccoAbsFactory {
    @Override
    public Hard createHard() {
        return new HookafinHard();
    }

    @Override
    public Light createLight() {
        return new HookafinLight();
    }
}
