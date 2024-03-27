public class Main1 {
    static class studentInformation{
        int id;
        String name;
        String gender;
        double web;
        double java;
        // constructor
        studentInformation(int id, String name, String gender, double web, double java){
            this.id=id;
            this.name=name;
            this.gender=gender;
            this.web=web;
            this.java=java;
        }
        public void printBasicInfo(){
            System.out.println("<><><>Student Information<><><>");
            System.out.println("ID\tName\tGender\tWeb\t\tJava\tTotalscore\tAverge\tStatus");
        }
    }
    public static void main(String[] args) {
        studentInformation student = new studentInformation(1,"stalin","male",48.5,33.4);
        student.printBasicInfo();



    }
}
