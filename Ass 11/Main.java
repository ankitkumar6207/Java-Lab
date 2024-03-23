class JaggedArray {
    int[][] marks;

   
    public JaggedArray(int[] subjects) {
        marks = new int[5][];
        for (int i = 0; i < 5; i++) {
            marks[i] = new int[subjects[i]];
        }
    }

    
    public void inputMarks(int childIndex, int[] childMarks) {
        for (int i = 0; i < marks[childIndex].length; i++) {
            marks[childIndex][i] = childMarks[i];
        }
    }

   
    public void displayMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            System.out.print(childNames[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public void calculateTotalMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            System.out.println(childNames[i] + " Total Marks: " + totalMarks);
        }
    }

  
    public void countMarksAbove80() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > 80) {
                    count++;
                }
            }
            System.out.println(childNames[i] + " Marks above 80: " + count);
        }
    }

    
    public void alertMarksLessThan30() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 30) {
                    System.out.println(childNames[i] + " Alert: Marks less than 30 in subject " + (j + 1));
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
       
        int[] subjects = {3, 5, 2, 6, 4};

        
        JaggedArray obj = new JaggedArray(subjects);

        obj.inputMarks(0, new int[]{90, 85, 25});
        obj.inputMarks(1, new int[]{70, 60, 80, 90, 25});
        obj.inputMarks(2, new int[]{50, 40});
        obj.inputMarks(3, new int[]{80, 85, 90, 95, 85, 75});
        obj.inputMarks(4, new int[]{70, 60, 55, 40});
        obj.displayMarks();
        obj.calculateTotalMarks();
        obj.countMarksAbove80();
        obj.alertMarksLessThan30();
    }
}
