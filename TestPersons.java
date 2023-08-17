public class TestPersons {
    //GABRIEL KENJI UTIYAMA CB3012069
    public static void main(String[] args){
        Student student = new Student("Gabriel Kenji", "Algum lugar", "ADS", 2023, 10);
        Staff staff = new Staff("Tuller" , "ALgum lugar", "IFSP CBT", 10000);

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        System.out.println(student);
        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
        System.out.println(staff);
    }
}
