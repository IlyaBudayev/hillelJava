package homeWork4;

import java.math.BigDecimal;

public class Aspirant extends Student {
     BigDecimal salary;


    public Aspirant(String name) {
        super("Gosha");
    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
