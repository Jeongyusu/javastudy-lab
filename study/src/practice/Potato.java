package practice;

public class Potato {

    private int price;
    private String desc;

    public Potato() {
        this(800, "감자");
    }

    public Potato(int price) {
        this(price, "감자");
    }

    public Potato(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("감자가 만들어졌습니다.");

    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
