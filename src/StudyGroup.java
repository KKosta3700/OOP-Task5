import java.util.ArrayList;
import java.util.List;

// Класс Учебная Группа
public class StudyGroup {
    private final Teacher teacher;
    private final List<Student> students;

    // Конструктор класса
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    // Метод для получения списка студентов группы
    public List<Integer> getStudentIds() {
        List<Integer> studentIds = new ArrayList<>();
        for (Student student : students) {
            studentIds.add(student.getId());
        }
        return studentIds;
    }

    // Метод для получения идентификатора преподавателя группы
    public int getTeacherId() {
        return teacher.getId();
    }
}
