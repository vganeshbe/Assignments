package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("This is Desktop Size Method...");
	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
}
