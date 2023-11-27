import java.util.Arrays;

class MyClass {
    // Поля разных типов
    private int id;
    private String name;
    private double value;
    private boolean flag;
    private char category;

    // Конструктор класса
    public MyClass(int id, String name, double value, boolean flag, char category) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.flag = flag;
        this.category = category;
    }

    // Геттер для уникального идентификатора
    public int getId() {
        return id;
    }

    // Метод для поиска объекта по id в неотсортированном массиве
    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", flag=" + flag +
                ", category=" + category +
                '}';
    }
}
