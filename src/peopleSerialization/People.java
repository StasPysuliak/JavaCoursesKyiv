package peopleSerialization;

import java.io.Serializable;

public class People implements Cloneable, Serializable {

    private String name;
    private String surName;
    private int age;

    public People(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        People guest = (People) obj;

        if (this == obj) return true;

        if (obj == null) return false;                       //Проверьте объект на null
        if (this.getClass() != obj.getClass()) return false; //объекты были одного типа
        if (name == null || surName == null) return false;

        if (age != guest.age) return false;
        if (!name.equals(guest.name)) return false;          //сравниваие атрибутов
        if (!surName.equals(guest.surName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surName == null) ? 0 : surName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Human [Name = " + name + ", SurName = " + surName + ", Age = " + age + "]";
    }

    @Override
    public People clone() throws CloneNotSupportedException {
        return (People)super.clone();
    }

}
