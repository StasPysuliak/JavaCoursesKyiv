package Student;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class StudentList {
    private  ArrayList<Student> list = new ArrayList<>();
    //private int p = 0;
    Student student = new Student("this student is removed");

    public void add(Student s) {
        //list[p++] = s;
        list.add(s);
    }

    public Student get(int n) {
        //return list[n];
        return list.get(n);
    }

    public int findName(String name) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int findSurname(String surName) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getSurname().equalsIgnoreCase(surName))
                return i;
        }
        return -1;
    }

    public int findDate(String findDate) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getBirth().equalsIgnoreCase(findDate))
                return  i;
        }
        return -1;
    }

    public void removeStudent(String name) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equalsIgnoreCase(name))
                list.set(i,student);
        }
    }
}
