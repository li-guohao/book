package cn.liguohao.design.pattern.recombination.sixth;

/**
 * @Description TODO 鸭子模拟器
 * @Author liguohao
 * @Date 2020/10/5 12:29
 */
public class DuckSimulator{
    public static void main(String[] args) {
        QuackableAbstractFactory quackableFactory = new QuackableFactory();
        Quackable quackable = quackableFactory.createQuackable(RedheadDuck.class);

        RedheadDuck redheadDuck = (RedheadDuck) quackable;

        Quackologist quackologist = new Quackologist();

        redheadDuck.registerObserver(quackologist);

        redheadDuck.quack();
        redheadDuck.quack();

    }


}
