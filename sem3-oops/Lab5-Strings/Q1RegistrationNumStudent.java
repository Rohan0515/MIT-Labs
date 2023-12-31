import java.util.Scanner;
import java.util.GregorianCalendar;

class Student {
    int regno;
    String fName;
    GregorianCalendar DOJ;
    short sem;
    float gpa,cgpa;
    static int count=1;

    Student() {
        count+=1;
    }

    String calcYear(String DOJ) {
        int c=0,i=0;
        int ind=-1;
        while(c!=2) {
            if(DOJ.charAt(i) == '/') {
                c+=1;
            }
            else {
                ind=i+1;
            }
            i+=1;
        }
        return (DOJ.substring(ind+1,DOJ.length()));
    }

    Student(String name,int d,int m, int y,short semester,float gpavg,float cgpavg) {
        GregorianCalendar gcal = new GregorianCalendar(y,m,d);
        String st = Integer.toString(gcal.get(1));
        String yst = st.substring(2,4);
        String n = Integer.toString(count);
        String regnumString = yst+n;
        regno = Integer.parseInt(regnumString);
        fName = name;
        DOJ = gcal;
        sem=semester;
        gpa=gpavg;
        cgpa=cgpavg;
        count+=1;
    }

    void display() {
        System.out.println("\nName of student: "+fName+"\nRegistration Number: "+regno+"\nDate of joining: "+DOJ.get(5)+"/"+DOJ.get(2)+"/"+DOJ.get(1)+"\nSemester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa);
    }
}

class Q1RegistrationNumStudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students. (Minimum 5) ");
        int n = sc.nextInt();
        sc.nextLine();
        Student stds[] = new Student[n];
        for(int i=0;i<n;i++) {
            System.out.println("\nEnter details for student number "+(i+1));
            System.out.print("Enter your name ");
            String fName = sc.nextLine();
            System.out.print("Enter day of DOJ ");
            int d = sc.nextInt();
            System.out.print("Enter month of DOJ ");
            int m = sc.nextInt();
            System.out.print("Enter year of DOJ ");
            int y = sc.nextInt();
            System.out.print("Enter your semester ");
            short semester = sc.nextShort();
            System.out.print("Enter your gpa ");
            float gpavg = sc.nextFloat();
            System.out.print("Enter your cgpa ");
            float cgpavg = sc.nextFloat();
            sc.nextLine();

            stds[i] = new Student(fName,d,m,y,semester,gpavg,cgpavg);
        }

        System.out.println("\nDisplaying details of all students:\n");
        for(int i=0;i<n;i++) {
            System.out.println("\nDisplaying details for student number "+(i+1));
            stds[i].display();
        }
    }
}