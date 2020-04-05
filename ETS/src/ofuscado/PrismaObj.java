package ofuscado;

public class PrismaObj{
	
	private double baseTriangulo;
	private double alturaPrisma;
	
	
	PrismaObj(double baseTriangulo, double alturaPrisma){
		this.baseTriangulo=baseTriangulo;
		this.alturaPrisma=alturaPrisma;
	}
	
	public double getBaseTriangulo() {
		return baseTriangulo;
	}

	public void setBaseTriangulo(double baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	public double getAlturaPrisma() {
		return alturaPrisma;
	}

	public void setAlturaPrisma(double alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}
		
	public double areaTotal(double baseTriangulo, double alturaPrisma) {
		return (2*this.areaBase(baseTriangulo) + this.areaLateral(baseTriangulo, alturaPrisma));
	}
	
	private double areaLateral(double baseTriangulo, double alturaPrisma) {
		return (this.perimetro(baseTriangulo)*alturaPrisma);
	}
	
	private double perimetro(double baseTriangulo) {
		return (3*baseTriangulo);
	}
	
	private double areaBase(double baseTriangulo) {
		return (baseTriangulo*this.alturaTriangulo(baseTriangulo))/2;
	}
	
	private double alturaTriangulo(double baseTriangulo) {
		return (Math.sqrt(3)/2*baseTriangulo);
	}
}
