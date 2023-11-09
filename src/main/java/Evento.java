import java.util.ArrayList;
import java.util.Date;

public class Evento {
	private Disciplina disciplina;
	private ArrayList<Equipo> equiposParticipantes = new ArrayList<>();
	private Date fecha;

	// Constructor
	public Evento(Disciplina disciplina, Date fecha) {
		this.disciplina = disciplina;
		this.fecha = fecha;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public ArrayList<Equipo> getEquiposParticipantes() {
		return this.equiposParticipantes;
	}

	public void setEquiposParticipantes(ArrayList<Equipo> equiposParticipantes) {
		this.equiposParticipantes = equiposParticipantes;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void mostrarInformacion() {
		System.out.println("Disciplina: " + disciplina.getNombre());
		System.out.println("Fecha: " + fecha);
		System.out.println("Equipos Participantes: " + equiposParticipantes.toString());
	}
}
