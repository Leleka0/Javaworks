//Клас, який представляє академгрупу з методами виведення на екран назви групи і кількості студентів в ній
class AcademGroup {
    private String groupName;
    private int studentCount;

    
    public AcademGroup() {
        this.groupName = "Невiдома група";
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
        System.out.println("Кiлькiсть студентiв: " + studentCount);
    }

    
    public void printInfo() {
        System.out.println("Група: " + groupName + ", Студентiв: " + studentCount);
    }

    
    public void printInfo(String prefix) {
        System.out.println(prefix + " -> Група: " + groupName + ", Студентiв: " + studentCount);
    }
}


public class laba71 {
    public static void main(String[] args) {
        
        AcademGroup g1 = new AcademGroup();
        g1.printGroupName();        
        g1.printStudentCount();     
        g1.printInfo();             

        System.out.println(); 

        
        AcademGroup g2 = new AcademGroup("ТТ-201", 16);
        g2.printGroupName();       
        g2.printStudentCount();     
        g2.printInfo();             
        g2.printInfo("Iнформацiя"); 
    }
}

