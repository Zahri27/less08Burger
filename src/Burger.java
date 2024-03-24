public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private boolean mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printBurgerInfo();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, false);
    }

    public Burger(String bun, String meat) {
        this(bun, meat, "Чеддер", "Салат", true);
    }

    private void printBurgerInfo() {
        System.out.println("Состав бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("Мясо: " + meat);
        System.out.println("Сыр: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + (mayonnaise ? "Да" : "Нет"));
        System.out.println();
    }
}

// Метод для вывода состава бургера
