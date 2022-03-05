package org.inheritances;

public class MultiLevelInheritances extends MultiLevelInheritances2 {
	public void empName() {
		System.out.println("The employee name is;Rajesh");
	}
public static void main(String[] args) {
	MultiLevelInheritances n=new MultiLevelInheritances();
	n.empName();
	n.compName();
}
	
}

