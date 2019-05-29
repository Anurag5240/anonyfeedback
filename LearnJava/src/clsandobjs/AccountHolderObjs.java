package clsandobjs;

public class AccountHolderObjs {

	public static void main(String[] args) {
		
		Accountholder tom = new Accountholder();
		Accountholder henry = new Accountholder();
		Accountholder sarah = new Accountholder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligCC();

		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=31;
		henry.accountBalance=20000;
		henry.testEligCC();
		
		sarah.firstName="Sarah";
		sarah.lastName="Miller";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.testEligCC();
				
		System.out.println("Eligibility for");
		System.out.println("Tom:"+tom.eligibleForCC);
		System.out.println("Henry:"+henry.eligibleForCC);
		System.out.println("Sarah:"+sarah.eligibleForCC);
	}


}
