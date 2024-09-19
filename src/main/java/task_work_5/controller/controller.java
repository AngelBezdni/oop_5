package task_work_5.controller;

import task_work_5.model.Student;
import task_work_5.model.Type;
import task_work_5.model.User;
import task_work_5.servise.DataServise;
import task_work_5.view.StudentView;

import java.util.List;

public class controller {

    private final DataServise servise = new DataServise();

    private final StudentView view = new StudentView();

    public void createStudent (String firstName, String lastName, String middleName){
        servise.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = servise.getAllStudent();
        for(User user: userList){
            Student student = (Student) user;
            view.ptintOnConsole(student);
        }
    }

}
