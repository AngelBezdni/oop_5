package task_work_5.servise;

import task_work_5.model.Group;
import task_work_5.model.Student;
import task_work_5.model.Teacher;

import java.util.List;

public interface GroupService {
    Group createGroup(Teacher teacher, List<Student> students);
}