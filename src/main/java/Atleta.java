import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> listaDisciplinas;

	public Atleta(String nombre, String pais, int edad) {
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.listaDisciplinas = new ArrayList<>();
	}

	public void agregarDisciplina(Disciplina disciplina) {
		listaDisciplinas.add(disciplina);
	}

	public void eliminarDisciplina(Disciplina disciplina) {
		listaDisciplinas.remove(disciplina);
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("País: " + pais);
		System.out.println("Edad: " + edad);
		System.out.println("Disciplinas: " + listaDisciplinas.toString());
	}
}


