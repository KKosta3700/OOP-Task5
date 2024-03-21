import java.util.List;

// Класс Контроллер
public class Controller {
    private final StudyGroupService studyGroupService;

    // Конструктор класса
    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    // Метод для агрегации функций получения списка студентов и преподавателя и формирования учебной группы
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.formStudyGroup(teacher, students);
    }
}

