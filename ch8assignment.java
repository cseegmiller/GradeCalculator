/*
 * Caroline Seegmiller
 * 11/05/2021
 * JDK 17.0.1
 * This program will calculate the sum, avg, min, and max of an array of scores
 * and also keep a tally of letter grades earned.
 */


import javax.swing.JOptionPane;
public class ch8assignment {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null, 
                "How many scores do you have?");
        int numberOfScores=Integer.parseInt(input);
        int scores[]=new int[numberOfScores];
        for(int i=0;i<scores.length;i++){
            input=JOptionPane.showInputDialog(null,"Enter score "+(i+1));
            scores[i]=Integer.parseInt(input);     
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int gradeA=0;
        int gradeB=0;
        int gradeC=0;
        int gradeD=0;
        int gradeF=0;
        
        for(int i=0;i<scores.length;i++){
            sum=sum+scores[i];
            if(scores[i]>max)
                max=scores[i];
            if(scores[i]<min)
                min=scores[i];
            if (scores[i]>=90 && scores[i]<=100)
                gradeA ++;
            if (scores[i]>=80 && scores[i]<90)
                gradeB ++;
            if (scores[i]>=70 && scores[i]<80)
                gradeC ++;
            if (scores[i]>=60 && scores[i]<70)
                gradeD ++;
            if (scores[i]<60)
                gradeF ++;
        }
        JOptionPane.showMessageDialog(null, "Sum: " + sum 
                + "\nAverage: " + (sum/scores.length)
                + "\nMax: " + max  
                + "\nMin: " + min
                + "\nNumber of A's: " + gradeA
                + "\nNumber of B's: " + gradeB
                + "\nNumber of C's: " + gradeC
                + "\nNumber of D's: " + gradeD
                + "\nNumber of F's: " + gradeF);
    }
    
}
