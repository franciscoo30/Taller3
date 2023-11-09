import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Atleta> listaAtletas = new ArrayList<>();
	private Disciplina disciplina;
	public ArrayList<Atleta> atletas = new ArrayList<>();
	public Evento evento;

	// Constructor
	public Equipo(String nombre, Disciplina disciplina) {
		this.nombre = nombre;
		this.disciplina = disciplina;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atleta> getListaAtletas() {
		return this.listaAtletas;
	}

	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		this.listaAtletas = listaAtletas;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void agregarAtleta(Atleta atleta) {
		listaAtletas.add(atleta);
	}

	public void eliminarAtleta(Atleta atleta) {
		listaAtletas.remove(atleta);
	}

	public void mostrarInformacion() {
		System.out.println("Nombre del Equipo: " + nombre);
		System.out.println("Disciplina: " + disciplina.getNombre());
		System.out.println("Atletas: " + listaAtletas.toString());
	}
}

