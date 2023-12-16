package Lab10;
interface IAnimal {
    public boolean run(double runDistance);
    public boolean swim(double swimDistance);
    public boolean jump(double jumpDistance);

}
public abstract class Animal implements IAnimal{
    String name;
    double runLimit;
    double swimLimit;
    double jumpLimit;

    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(double runDistance) {
        return runDistance <= runLimit;
    }

    @Override
    public boolean swim(double swimDistance) {
        return swimDistance <= swimLimit;
    }

    @Override
    public boolean jump(double jumpDistance) {
        return jumpDistance <= jumpLimit;
    }
}