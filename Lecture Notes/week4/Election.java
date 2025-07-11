import java.util.Scanner;	

class Voter{	

// Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output
    private static int current_voter_count=0;
	private static Voter new_voter=null;
	public static int total_no_of_voters;
    private Voter() {                           
		        current_voter_count++;					
    }

    public static Voter getVoter() {
        //implement singleton behaviour
		if(new_voter==null){
			new_voter=new Voter();
			return new_voter;
		}
		return null;
    }

    public void firstVoter(){
		        if(new_voter != null) {
			            EVM new_machine = EVM.getEVM(new_voter);
			            new_machine.startVoting();
		        }
    }

    public void callNewVoter() {
        // Write code to setup a new EVM object for the new voter
        new_voter=null;
		System.out.println("Voting completed for voter "+current_voter_count);
		if(current_voter_count<total_no_of_voters){
			Voter v_next=getVoter();
			EVM new_machine=EVM.getEVM(v_next);
			
		
        //Ignore the following 6 lines of code
        //but do not delete this code in your submission 
//======================================================================== 
        try {
		            EVM x = EVM.getEVM(null);
			            x.startVoting();
		        }catch(NullPointerException e) {
			            System.out.println("EVM is Singleton");
	        }
//========================================================================  	
	        // Resume writing your code here
	        new_machine.startVoting();
		}
	        // Hint: Write code to start voting for the new user on the new EVM
    }
}

class EVM{

    // Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output
        private static Voter current_voter=null;
		private static int evm_count=0;
		private static EVM current_evm=null;

        private EVM(Voter v) {
            current_voter = v;
		            evm_count++;
        }
        public static EVM getEVM(Voter v) {
            // Implement singleton behaviour
			if(current_evm==null){
				current_evm=new EVM(v);
				return current_evm;
			}
			return null;
        }

        public void startVoting() {
            // Complete voting for the current voter and call the next voter
            // Hint : Use callback here
			System.out.println("voting under process on EVM number "+evm_count);
			current_evm=null;
			current_voter.callNewVoter();
        }
}


public class Election{
	        public static void main(String args[]) {
		            Scanner s = new Scanner(System.in);
		            Voter.total_no_of_voters =  s.nextInt();
		            // Assume input is always non zero
		            Voter v = Voter.getVoter();
		
		            //Trying to create another voter when one voter is in the middle of 
		            //voting process, students can ignore this try-catch block of code
		
				            try {
					                Voter x = Voter.getVoter();
					                x.callNewVoter();
				            } catch(NullPointerException e) {
					                System.out.println("Voter is Singleton");
				            }
				
		            //Starting the first vote of the day
		                v.firstVoter();
	        }
}