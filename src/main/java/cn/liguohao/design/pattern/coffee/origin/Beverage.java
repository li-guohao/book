package cn.liguohao.design.pattern.coffee.origin;

/**
 * @Description TODO beverage abstract entity
 * @Author liguohao
 * @Date 2020/9/20 22:24
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    // TALL, GRANDE, VENTI
    protected Enum size;

    // beverage description get methods
    public String getDescription(){return this.description;}

    /**
     * @return calculate beverage cost
     */
    public abstract double cost();

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }
}