package decorate;

public abstract class Beverage {
    public String desc = "제목 없음";

    public String getDesc() {
        return this.desc;
    }

    public abstract double cost();
}
