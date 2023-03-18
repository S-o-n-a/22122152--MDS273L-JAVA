public class Lab5 {

    public static void main(String[] args){
        class Student {
            private String regNo;
            private String name;
            private String email;
            private String phone;
            private String className;
            private String department;
        
            public Student(String regNo, String name, String email, String phone, String className, String department) {
                this.regNo = regNo;
                this.name = name;
                this.email = email;
                this.phone = phone;
                this.className = className;
                this.department = department;
            }
        
            public String getRegNo() {
                return regNo;
            }
        
            public String getName() {
                return name;
            }
        
            public String getEmail() {
                return email;
            }
        
            public String getPhone() {
                return phone;
            }
        
            public String getClassName() {
                return className;
            }
        
            public String getDepartment() {
                return department;
            }
        
            public void printDetails() {
                System.out.println("Reg. No.: " + regNo);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
                System.out.println("Class: " + className);
                System.out.println("Department: " + department);
            }
        }
        
    }
    
    
}
