package developer;

public class SeniorPomidorDeveloper extends Developer {

    public SeniorPomidorDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) +
                (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
