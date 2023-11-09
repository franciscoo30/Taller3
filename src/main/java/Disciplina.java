import java.util.ArrayList;

public class Disciplina {
	private String nombre;
	private int numeroParticipantes;
	private String record;
	public Atleta atleta;
	public ArrayList<Atleta> atletas = new ArrayList<Atleta>();
	public Evento evento;

	public Disciplina(String nombre, int numeroParticipantes, String record) {
		this.nombre = nombre;
		this.numeroParticipantes = numeroParticipantes;
		this.record = record;
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroParticipantes() {
		return this.numeroParticipantes;
	}

	public void setNumeroParticipantes(int numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public String getRecord() {

		return this.record;
	}

	public void setRecord(String record) {

		this.record = record;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Número de Participantes: " + numeroParticipantes);
		System.out.println("Récord Mundial: " + record);
	}
}