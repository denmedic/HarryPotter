public class Main {
    public static void main(String[] args) {
        GryffindorStudents harry = new GryffindorStudents("Harry", "Potter", 98, 90, 100, 99, 95);
        GryffindorStudents germiona = new GryffindorStudents("Germiona", "Greyndger", 89, 76, 81, 65, 67);
        GryffindorStudents ron = new GryffindorStudents("Ron", "Yisli", 45,43,78,56,79);
        KogtevranStudents chzoy = new KogtevranStudents("Chzoy","Chang",56,76,87,34,45,12);
        KogtevranStudents padma = new KogtevranStudents("Padma","Patil",56,78,65,34,67,34);
        KogtevranStudents marcus = new KogtevranStudents("Marcus","Belbi",45,34,87,34,56,65);
        PuffendyStudents zaharya = new PuffendyStudents("Zaharya","Smith",34,56,76,45,76);
        PuffendyStudents sedrick = new PuffendyStudents("Sedrick","Diggory",97,76,56,34,56);
        PuffendyStudents dgastin = new PuffendyStudents("Dgastin","Phinch-Phlechly",45,65,78,24,45);
        SlytherinStudents drako = new SlytherinStudents("Drako","Malphoy",55,66,76,34,56,98,100);
        SlytherinStudents grehem = new SlytherinStudents("Grehem","Montegy", 33,44,55,66,67,56,34);
        SlytherinStudents gregory = new SlytherinStudents("Gregory","Goyl",44,55,66,77,88,22,12);
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        System.out.println(chzoy);
        System.out.println(padma);
        System.out.println(marcus);
        System.out.println(zaharya);
        System.out.println(sedrick);
        System.out.println(dgastin);
        System.out.println(drako);
        System.out.println(grehem);
        System.out.println(gregory);
        System.out.println();
        System.out.println("Сравнение по всей школе:");
        harry.comparisonStudentFaculty(chzoy);
        sedrick.comparisonStudentFaculty(drako);
        germiona.comparisonStudentFaculty(zaharya);
        System.out.println();
        System.out.println("Сравнение по факультетам:");
        System.out.println("Гриффиндор:");
        harry.comparisonStudentGryffindor(ron);
        System.out.println("Когтевран:");
        chzoy.comparisonStudentKogtevran(padma);
        System.out.println("Пуффендуй:");
        sedrick.comparisonStudentPuffendy(dgastin);
        System.out.println("Слизерин:");
        drako.comparisonStudentSlytherin(gregory);

    }





}
