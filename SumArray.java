public class SumArray {
    public static void main(String[] args) {
        
        // int marks[]={47,56,32,48,91};
        // int TotalMarks=0;
        // for (int mark : marks) {
        //     TotalMarks+=mark;
            
        // }
        // System.out.println(TotalMarks);

//find minimum value
                // int marks[]={47,56,32,48,91};
                // int minMarks= Integer.MAX_VALUE;
                // for(int mark:marks){
                //     if (mark<minMarks) {
                //         minMarks=mark;
                //     }
                // }
                // System.out.println(minMarks);

//For maximum value
                        int marks[]={47,56,32,48,91};
                        int maxMarks=Integer.MIN_VALUE;

//Using For Each Loop                        
                        // for(int mark:marks){
                        //     if (mark>maxMarks) {
                        //         maxMarks=mark;
                        //     }
                        // }

  //using For Loop
                        for(int i=0;i<marks.length;i++){
                            if (marks[i]>maxMarks) {
                                maxMarks=marks[i];
                            }
                        }
                        System.out.println(maxMarks);  
                     }
}
