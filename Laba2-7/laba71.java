//Клас, який представляє академгрупу з методами виведення на екран назви групи і кількості студентів в ній
class AcademGroup {
    private String groupName;
    private int studentCount;

    
    public AcademGroup() {
        this.groupName = "Невідома група";
        this.studentCount = 0;
    }

    
    public AcademGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    
    public void printGroupName() {
        System.out.println("Назва групи: " + groupName);
    }

   
    public void printStudentCount() {
        System.out.println("Кількість студентів: " + studentCount);
    }

    
    public void printInfo() {
        System.out.println("Група: " + groupName + ", Студентів: " + studentCount);
    }

    
    public void printInfo(String prefix) {
        System.out.println(prefix + " -> Група: " + groupName + ", Студентів: " + studentCount);
    }
}


public class laba71 {
    public static void main(String[] args) {
        
        AcademGroup g1 = new AcademGroup();
        g1.printGroupName();        
        g1.printStudentCount();     
        g1.printInfo();             

        System.out.println(); 

        
        AcademGroup g2 = new AcademGroup("КН-23", 28);
        g2.printGroupName();       
        g2.printStudentCount();     
        g2.printInfo();             
        g2.printInfo("Інформація"); 
    }
}

