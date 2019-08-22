package CandyGift.Sweets;

public abstract class Sweet {
    String name;
    public double weight;
    public int price;
  static int count = 0;

    public Sweet(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        count++;
    }

    @Override
    public String toString() {
        return "Название: " + name + "; Вес, [г]: " + weight + "; Цена, [руб]: " + price;
    }
}
