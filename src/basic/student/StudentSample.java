package basic.student;

class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("yomogi","girl",1);
        Student student2 = new Student("daifuku","boy",2);

        System.out.println(student1.getName());//yomogi
        System.out.println(student1.getGender());//girl
        System.out.println(student1.getGrade());//1
        System.out.println(student1);//Student{name='yomogi',gender='garl',grade=1}
        System.out.println(student2.getName());//daifuku
        System.out.println(student2.getGender());//boy
        System.out.println(student2.getGrade());//2
        System.out.println(student2);//Student{name='daifuku',gender='boy',grede=2}

        student1.setGrade(2);
        System.out.println(student1.getGrade());//2

    }
}
