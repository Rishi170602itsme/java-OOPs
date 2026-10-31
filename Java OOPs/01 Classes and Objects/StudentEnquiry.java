 class Student {
    private int sId ;
    private String sName;

    public int id (){
        return sId;
        }
         public String getName(){
            return sName;
    }
    Student(int sId , String sName){
        this.sId = sId;
        this.sName = sName;

    }
}

public class StudentEnquiry {

      public Student enquiry ( Student[] sList, int targetId){
        int i;

        for( i = 0; i < sList.length; i ++ ){
        if(sList[i].id() == targetId){
            return sList[i];
        }
            }
        return null;
    
        
    }

public static void main(String[] args) {

    Student student [] = new Student[5];
    student[0] = new Student(1,  "Avinash");
    student[1] = new Student (2,"Bheem");
    student[2]= new Student (3, "Chinmay");
    StudentEnquiry SE = new StudentEnquiry();
Student value = SE.enquiry(student, 3);
if(value == null )
    System.out.println("Student id : " + value);
else
System.out.println(value.getName());


}

}