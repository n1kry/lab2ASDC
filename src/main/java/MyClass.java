import java.util.Arrays;

class MyClass {
    // ���� ������ �����
    private int id;
    private String name;
    private double value;
    private boolean flag;
    private char category;

    // ����������� ������
    public MyClass(int id, String name, double value, boolean flag, char category) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.flag = flag;
        this.category = category;
    }

    // ������ ��� ����������� ��������������
    public int getId() {
        return id;
    }

    // ����� ��� ������ ������� �� id � ����������������� �������
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
