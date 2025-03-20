package es.examen.primeraparte;

public class CursoImpl implements Curso {

	private String nombre;
	private int codigo;
	private int cupoDisponible;
	
	public CursoImpl(String nombre, int codigo, int cupoDisponible) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupoDisponible = cupoDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCupoDisponible() {
		return cupoDisponible;
	}

	public void setCupoDisponible(int cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

	@Override
	public String toString() {
		return "\nCurso :\nnombre = " + nombre + "\ncodigo = " + codigo + "\ncupo disponible = " + cupoDisponible;
	}

	@Override
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarCupoDisponible() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
