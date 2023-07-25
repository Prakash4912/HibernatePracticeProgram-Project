package InheritanceMappingIsarelationship;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {
	
	int contract_duration,payperhour;

	public int getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}

	public int getPayperhour() {
		return payperhour;
	}

	public void setPayperhour(int payperhour) {
		this.payperhour = payperhour;
	}
	

}
