import java.util.*;
public class L10_JobSequencingProblem {
    static class Job{
        int id;
        int deadline;
        int profit;
  
         public Job(int i, int d, int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
         }

      
        }
    
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        
        ArrayList <Job> jobs =new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
           jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
            
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); 
        //descending order of profit

        ArrayList <Integer> seq =new ArrayList<>();

        int time = 0;
        for(int i=0; i<jobs.size();i++){
            Job currJob = jobs.get(i);
           if(currJob.deadline > time){
            seq.add(currJob.id);
            time++;
           }
        }

        //print the job sequence
        System.out.println("max profit sequence of jobs:" + seq);
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }   
        System.out.println();
    }
}
