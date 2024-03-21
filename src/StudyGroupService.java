import java.util.List;

// Класс сервиса для работы с Учебными Группами
public class StudyGroupService {
    // Метод для формирования учебной группы из списка студентов и преподавателя
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}

