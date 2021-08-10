package StudentMethod;

import GradeException.GradeException;

public class Grader {
    private int[] gradeScore=new int[5];
    private int gradeCounter=0;

    public void addGradesToTheRepo(int grade) throws GradeException{
        if(grade<0||grade>=101){
            throw new GradeException("This grade is invalid");
        }
        else
       gradeScore[gradeCounter]=grade;
       gradeCounter++;
    }

    public int getGradeRepository(int index)throws GradeException {
       if(index<0||index>=gradeScore.length){
           throw new GradeException("This index is invalid");
       }
        return gradeScore[index];
    }
}
