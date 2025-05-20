package laba73;
// Абстрактний батьківський клас, що представляє персону, з абстрактним методом отримання інформації про персону і неабстрактними методами отримання ПІБ і віку персони. 
//Дочірні класи, що представляють співробітника фірми, з методами отримання назви фірми і посади співробітника і студента університету, з методами отримання назви його групи і номера курсу, на якому він навчається. 
//Головний клас з методом main, який одним оператором виводить на екран значення властивостей об'єктів-спадкоємців

abstract class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

  
    public abstract void getInfo();
}


class Employee extends Person {
    private String company;
    private String position;

    public Employee(String fullName, int age, String company, String position) {
        super(fullName, age);
        this.company = company;
        this.position = position;
    }

    @Override
    public void getInfo() {
        System.out.println("Спiвробiтник: " + fullName + ", Вiк: " + age + 
            ", Компанiя: " + company + ", Посада: " + position);
    }
}


class Student extends Person {
    private String group;
    private int course;

    public Student(String fullName, int age, String group, int course) {
        super(fullName, age);
        this.group = group;
        this.course = course;
    }

    @Override
    public void getInfo() {
        System.out.println("Студент: " + fullName + ", Вiк: " + age + 
            ", Група: " + group + ", Курс: " + course);
    }
}


public class laba73 {
    public static void main(String[] args) {
        
        Person p1 = new Employee("Стiв Джопес", 35, "SuperDuperTechCentr", "Розробник");
        Person p2 = new Student("Тимофiй Ширай", 19, "ТТ-201", 2);
        Person p3 = new Employee("Марiя Тереза", 40, "MegaUltraServes", "Менеджер");
        Person p4 = new Student("Людвiг Бетховен", 20, "ТТ-301", 3);

       
        Person[] people = {p1, p2, p3, p4};

        
        for (Person person : people) {
            person.getInfo();  
        }
    }
}
