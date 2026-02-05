public class arrays {
    public static void main(String[] args) {
        //int [] marks = {98,45,79,99};
        float[] marks = {98, 45, 99, 80, 78.87f, 80.5f, 89};
        String[] students = {"Harry", "Rama", "Shubham", "lovish"};
        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(students.length);
        System.out.println(students[2]);

       /* for(int i=0; i<marks.length; i++ ){
            System.out.println(marks[i]);
        }*/
        for(int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
