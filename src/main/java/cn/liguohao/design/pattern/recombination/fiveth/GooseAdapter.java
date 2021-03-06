package cn.liguohao.design.pattern.recombination.fiveth;

/**
 * @Description TODO 鸭子的鹅适配器
 * @Author liguohao
 * @Date 2020/10/5 12:41
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    /**
     * @param goose 需要适配的鹅
     */
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
