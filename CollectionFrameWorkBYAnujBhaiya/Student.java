package CollectionFrameWorkBYAnujBhaiya;

public class Student implements Comparable<Student> {
    String name;
    int rollno;
    
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollno;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollno != other.rollno)
            return false;
        return true;
    }

    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        return this.rollno-that.rollno;//by no
      //  return this.name.compareTo(that.name);//by no
    }

    

    
    
}
