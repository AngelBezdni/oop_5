package task_work_5.servise;
import task_work_5.model.Group;
import task_work_5.model.Student;
import task_work_5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Override
    public Group createGroup(Teacher teacher, List<Student> students) {
        // Создание новой учебной группы
        Group group = new Group();
        group.setTeacher(teacher);
        group.setStudents(students);
        return group;
    }
}