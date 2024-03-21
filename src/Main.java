import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты преподавателя и студентов
        Teacher teacher = new Teacher(1, "Иванов");
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Петров"));
        students.add(new Student(102, "Сидоров"));
        students.add(new Student(103, "Иванов"));

        // Создаем объект контроллера и сервиса учебной группы
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        // Формируем учебную группу
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        // Выводим информацию о созданной учебной группе
        System.out.println("Учебная группа сформирована:");
        System.out.println("Преподаватель: " + studyGroup.getTeacherId());
        System.out.println("Студенты: " + studyGroup.getStudentIds());
    }
}

