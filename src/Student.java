// Класс Студент
public class Student {
    private final int id;
    private final String name;

    // Конструктор класса
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттеры для получения данных
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

