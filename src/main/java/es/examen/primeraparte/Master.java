package es.examen.primeraparte;

public class Master extends CursoImpl {
	
	private boolean oficial;

	public Master(String nombre, int codigo, int cupoDisponible, boolean oficial) {
		super(nombre, codigo, cupoDisponible);
		this.oficial = oficial;
	}

	public boolean isOficial() {
		
		if((Math.random()*10)%2==0) {
			oficial = true;
		}
		
		return oficial;
	}

	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}

	@Override
	public void setCodigo(int codigo) {
		// TODO Auto-generated method stub
		super.setCodigo(codigo);
	}

	@Override
	public int getCupoDisponible() {
		// TODO Auto-generated method stub
		return super.getCupoDisponible();
	}

	@Override
	public void setCupoDisponible(int cupoDisponible) {
		// TODO Auto-generated method stub
		super.setCupoDisponible(cupoDisponible);
	}

	


	@Override
	public String toString() {
		return  super.toString()+"\nMaster oficial = " + oficial;
	}

	@Override
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		super.obtenerNombre();
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		super.obtenerCodigo();
	}

	@Override
	public void consultarCupoDisponible() {
		// TODO Auto-generated method stub
		super.consultarCupoDisponible();
	}
	
	

}
