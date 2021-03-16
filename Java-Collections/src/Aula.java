import java.util.Comparator;

public class Aula implements Comparator<Aula> {
	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	@Override
	public int compare(Aula o1, Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}


}
