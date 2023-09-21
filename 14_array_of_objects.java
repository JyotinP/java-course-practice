class Student{
    int rollno;  // instance variables
    String name;
    int marks;
}

class Aobjects{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Jul";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Aug";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Aur";
        s3.marks = 92;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0; i< students.length; i++){
            System.out.println(students[i].rollno + "|" + students[i].name + "|" + students[i].marks + "|");
        }

    } 
}