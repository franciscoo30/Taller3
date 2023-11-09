import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class EquipoTest {

    private Equipo equipo;
    private Atleta atleta1;
    private Atleta atleta2;
    private Disciplina disciplina;

    @BeforeEach
    public void setUp() {
        disciplina = new Disciplina("Baloncesto", 5, "RecordBaloncesto");
        equipo = new Equipo("Los Leones", disciplina);
        atleta1 = new Atleta("Luis", "España", 28);
        atleta2 = new Atleta("Ana", "Italia", 25);
    }

    @Test
    public void testAgregarAtleta() {
        equipo.agregarAtleta(atleta1);

        // Verificar que el atleta1 se haya agregado correctamente al equipo
        assertEquals(1, equipo.getListaAtletas().size());
        assertEquals(atleta1, equipo.getListaAtletas().get(0));

        // Agregar otro atleta al equipo
        equipo.agregarAtleta(atleta2);

        // Verificar que ambos atletas se hayan agregado correctamente al equipo
        assertEquals(2, equipo.getListaAtletas().size());
        assertEquals(atleta1, equipo.getListaAtletas().get(0));
        assertEquals(atleta2, equipo.getListaAtletas().get(1));
    }
}
