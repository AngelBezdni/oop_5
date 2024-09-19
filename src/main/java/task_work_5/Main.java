package task_work_5;

import task_work_5.model.Group;
import task_work_5.model.Student;
import task_work_5.model.Teacher;
import task_work_5.servise.GroupService;
import task_work_5.servise.GroupServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем преподавателя и студентов
        Teacher teacher = new Teacher("Иванов", "Иван", "Иванович", 10);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петр", "Петров", "Петрович", 1));
        students.add(new Student("Анна", "Андреева", "Андреевна", 2));
        students.add(new Student("Мария", "Михайлова", "Михайловна", 3));


        System.out.println(students);
        // Создаем сервис групп
        GroupService service = new GroupServiceImpl();

        // Формируем группу
        Group group = service.createGroup(teacher, students);

        System.out.println("Создана группа:");
        System.out.println("\tПреподаватель: " + group.getTeacher().toString());
        for (Student student : group.getStudents()) {
            System.out.println("\tСтуденты: " + student.toString());
        }
    }
}