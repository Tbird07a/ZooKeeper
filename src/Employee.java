import java.util.Objects;


public class Employee {
    //TODO: create employee class variables


    public String name;
    private int age;
    private int salary;
    public String position;
    private int years_experience;
    private boolean college_degree;




    public Employee(String name, int age, int salary, String position, int years_experience, boolean college_degree) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.years_experience = years_experience;
        this.college_degree = college_degree;
    }

    public Employee() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public int getYears_experience() {
        return years_experience;
    }


    public void setYears_experience(int years_experience) {
        this.years_experience = years_experience;
    }


    public boolean isCollege_degree() {
        return college_degree;
    }


    public void setCollege_degree(boolean college_degree) {
        this.college_degree = college_degree;
    }




    //TODO: any other methods?


    public void Salary() {
        int base_salary = salary;
        if ((Objects.equals(position, "Zookeeper") && college_degree)) {
            base_salary = base_salary + years_experience * 2000;
        }
        if ((Objects.equals(position, "Zookeeper") && !college_degree)) {
            base_salary = base_salary + years_experience * 1000;
        }
        if ((Objects.equals(position, "General Worker") && college_degree)) {
            base_salary = base_salary + years_experience * 500;
        }
        if ((Objects.equals(position, "General Worker") && !college_degree)) {
            base_salary = base_salary + years_experience * 300;
        }


        System.out.println("Salary: $" + base_salary);


    }




    public void addYear() {
        years_experience ++;
        System.out.println("Its been a year! " + name + " now has " + years_experience + " years of experience.");
    }










    //TODO: create main method test


    public static void main(String[] args) {
        Employee one = new Employee("Dawson", 14, 10000,"General Worker", 5,  false);
        one.Salary();
        one.addYear();






    }}




//EOC: get out de

