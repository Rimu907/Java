package day02;

import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 * @author Xiloer
 *
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int salary;

    public Person(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary);
    }

    public static void main(String[] args) {
        Person p = new Person("张三",25,"男",5000);
        Person p2 = new Person("张三",25,"男",5000);

        System.out.println(p.toString());
        System.out.println(p.equals(p2));
    }
}
