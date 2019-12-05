package Stroitel;

public class Student {
    private String studentname;// имя
    private String surnamestudent;// фамилия
    private int agestudent;// лет
    private double highstudent;// рост

    public Student(StudentMaker studentMaker) {
        super();
        this.studentname = studentMaker.studentname;
        this.agestudent = studentMaker.agestudent;
        this.highstudent = studentMaker.highstudent;
        this.surnamestudent = studentMaker.surnamestudent;
    }

    public static class StudentMaker {
        private final String studentname;// имя
        private final String surnamestudent;// фамилия
        private final int agestudent;// лет
        private final double highstudent;// рост


        public StudentMaker(String studentname, String surnamestudent, int agestudent, double highstudent) {
            this.studentname = studentname;
            this.surnamestudent = surnamestudent;
            this.agestudent = agestudent;
            this.highstudent = highstudent;
        }

        @Override
        public String toString() {
            return "Student {" +
                    "name='" + studentname + '\'' +
                    ", surname='" + surnamestudent + '\'' +
                    ", age=" + agestudent +
                    ", high=" + highstudent +
                    '}';
        }
    }


}
