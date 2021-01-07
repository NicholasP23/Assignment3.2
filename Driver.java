public class Driver {

    public static void main(String[] args){
        String names[] = new String[5];
        int ages[]= new int[5];
        String jobTitles[]=new String[5];

        for(int i=0; i<names.length; i++){
            if(i==0) {
                names[i]="Blake Arouser";
                ages[i]= 56;
                jobTitles[i] = "Professional snuggler";
            }
            if(i==1) {
                names[i]="Mike Hogan";
                ages[i]= 12;
                jobTitles[i] = "Dice quality inspector";
            }
            if(i==2) {
                names[i]="Bob Builder";
                ages[i]= 10;
            }
            if(i==3) {
                names[i]="Nick Heberely";
                ages[i]= 22;
                jobTitles[i] = "Scuba diving pizza delivery man";
            }
            if(i==4) {
                names[i]="Albert Shacore";
                ages[i]= 43;
                jobTitles[i] = "Dog surfing instructor";
            }

        }

        for(int i=0; i<5; i++) {
            if(jobTitles[i] != null) {
                System.out.println( names[i] + " is " +
                        ages[i] + " and current job is " + jobTitles[i]);
            }
            else{
                System.out.println( names[i] + " is " +
                        ages[i] + " and currently has no job");

            }
        }
    }
}