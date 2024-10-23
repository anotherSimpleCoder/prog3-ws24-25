package uebung2.task2;

public record StudentRecord(String name, int matrikelnummer, double durchschnittsnote) {
	public StudentRecord(String name, int matrikelnummer, double durchschnittsnote) {
		if(durchschnittsnote < 1.0 || durchschnittsnote > 5.0) {
			throw new IllegalArgumentException();
		}
		
		this.name = name;
		this.matrikelnummer = matrikelnummer;
		this.durchschnittsnote = durchschnittsnote;
	}
	
	public boolean honorStudent() {
		return this.durchschnittsnote < 1.5;
	}
}