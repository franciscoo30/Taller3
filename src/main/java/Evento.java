import java.util.ArrayList;

public class Evento {
	private Disciplina disciplina;
	private ArrayList atletasParticipantes;
	private ArrayList equiposParticipantes;
	private Date fecha;
	public ArrayList<Atleta> atletas = new ArrayList<Atleta>();
	public ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList getAtletasParticipantes() {
		return this.atletasParticipantes;
	}

	public void setAtletasParticipantes(ArrayList atletasParticipantes) {
		this.atletasParticipantes = atletasParticipantes;
	}

	public ArrayList getEquiposParticipantes() {
		return this.equiposParticipantes;
	}

	public void setEquiposParticipantes(ArrayList equiposParticipantes) {
		this.equiposParticipantes = equiposParticipantes;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}