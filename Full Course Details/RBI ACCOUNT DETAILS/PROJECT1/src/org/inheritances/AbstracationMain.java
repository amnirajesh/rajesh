package org.inheritances;

public class AbstracationMain extends AbstractionSub {
	public void ceoSalary() {
		System.out.println("Ceo Salary to be confirmed by MD");
	}

	public void fmSalary() {

		System.out.println("Fm Salary to be confimed by Ceo");
	}

	private void teamLeaderSalary() {
		System.out.println("to be confirm");
	}

	public void managerSalary() {
		System.out.println("Salary of Manager Will be fixed on next october");
	}


	public static void main(String[] args) {
		AbstracationMain a = new AbstracationMain();
		a.managerSalary();
		a.teamLeaderSalary();
		a.ceoSalary();
		a.fmSalary();

	}
}