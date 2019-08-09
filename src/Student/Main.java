package Student;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        final StudentList sl = new StudentList();

        sl.add(new Student("Vova","Ivanov",new GregorianCalendar(1986,1,1)));
        sl.add(new Student("Artem","Kasper",new GregorianCalendar(2001,4,20)));

        int n = sl.findName("Vova");
        int s = sl.findSurname("Kasper");
        int d = sl.findDate("01.01.1986");
        System.out.println(sl.get(n).getBirth() + " " + sl.get(n).getName()+ " " + sl.get(n).getSurname());
        System.out.println(sl.get(s).getBirth() + " " + sl.get(s).getName()+ " " + sl.get(s).getSurname());
        System.out.println(sl.get(d).getBirth() + " " + sl.get(d).getName()+ " " + sl.get(d).getSurname());
        sl.removeStudent("Vova");
        System.out.println(sl.get(n).getName()+ " " + sl.get(n).getSurname());
        //System.out.println(sl.get(s).getBirth() + " " + sl.get(s).getName()+ " " + sl.get(s).getSurname());
    }
}

