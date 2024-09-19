package task_work_5.model;

import java.util.List;

public class Group {

    private Teacher teacher;
    private List<Student> students;

    public Group() {}

    public Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}