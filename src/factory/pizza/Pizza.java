package factory.pizza;

public abstract class Pizza {
    private String name;

    public void prepare() {
        System.out.printf("%s (을)를 준비중입니다.\n", this.getName());
    }
    public void cut() {
        System.out.println("컷팅합니다.");
    }
    public void box() {
        System.out.println("포장했습니다");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
