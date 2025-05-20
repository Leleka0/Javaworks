//Батьківський клас, що представляє академгрупу з методами виведення на екран назви групи і числа студентів в ній. Дочірній клас
//який представляє потік (об'єднання) декількох академгруп з методами, які виводять назву потоку і загальне число студентів в потоці
//Головний клас з методом main, який одним оператором виводить назву і кількість студентів в академгрупі або потоці, які є елементами загального масиву
class AcademGroup {
    protected String groupName;
    protected int studentCount;

    public AcademGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    
    public void printInfo() {
        System.out.println("Академгрупа: " + groupName + ", Студентiв: " + studentCount);
    }
}


class Stream extends AcademGroup {
    private String streamName;
    private AcademGroup[] groups;

    public Stream(String streamName, AcademGroup[] groups) {
        super(streamName, 0); 
        this.streamName = streamName;
        this.groups = groups;
        
        int total = 0;
        for (AcademGroup g : groups) {
            total += g.studentCount;
        }
        this.studentCount = total;
    }

    
    @Override
    public void printInfo() {
        System.out.println("Потiк: " + streamName + ", Загальна кiлькiсть студентiв: " + studentCount);
    }
}


public class laba72 {
    public static void main(String[] args) {
      
        AcademGroup g1 = new AcademGroup("ТТ-201", 16);
        AcademGroup g2 = new AcademGroup("ТТ-202", 19);
        AcademGroup g3 = new AcademGroup("ТТ-203", 20);

       
        Stream s1 = new Stream("ТТ", new AcademGroup[]{g1, g2, g3});

       
        AcademGroup[] elements = {g1, g2, g3, s1};

       
        for (AcademGroup ag : elements) {
            ag.printInfo(); 
        }
    }
}
