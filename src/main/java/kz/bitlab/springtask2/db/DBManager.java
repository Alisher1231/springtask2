package kz.bitlab.springtask2.db;

import kz.bitlab.springtask2.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    @Getter
    @Setter
    private static List<Student> students=new ArrayList<>();

    static {
        students.add(new Student(1L,"Adil","A",80,"A"));
        students.add(new Student(1L,"Sanzhar","A",60,"B"));
        students.add(new Student(1L,"Kuat","A",60,"B"));
        students.add(new Student(1L,"Kuat","A",60,"B"));


    }

    public static void add(String name,String surname,int exam,String mark){

        students.add(new Student((long)(students.size()+1),name,surname,exam,mark));

    }
}
