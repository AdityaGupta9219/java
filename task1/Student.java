class Student {
    private String name;
    private int rollnumber;
    private double percentage;
    Student(){
        this.name = "unknown";
        this.rollnumber = 0;
        this.percentage = 0.0;
    }

    Student(String name, int rollnumber,double percentage){
        this.name = name;
        this.rollnumber = rollnumber;
        this.percentage = percentage;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setrollnumber(int rollnumber){
        this.rollnumber = rollnumber;
    }
    public void setpercentage(double percentage){
        this.percentage = percentage;
    }
    public String getname(){
        return name;
    }
    public int getrollnumber(){
        return rollnumber;
    }
    public double getpercentage(){
        return percentage;
    }
    public void printDetails(){
        System.out.println(name + " "+ rollnumber+" "+percentage);
    }
    public void setPercentage(double per){
        if(percentage< 0 || percentage>100){
            System.out.println("Invalid percentage");
            return;
        }
        else {
            percentage = per;
        }
    }
}

class StudentTest extends Student{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.setname("aditya gupta");
        s1.setrollnumber(11);
        s1.setpercentage(73.81);

        //details of s1
        s1.printDetails();
        
        Student s2 = new Student("Aryan singh",29,82.3);
        s2.printDetails();

    }
}