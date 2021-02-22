package conociendo_jcreator; 

public class producto {
	
	String nombre = "";
	double precio_base = 0,
	precio_iva = (precio_base * 0.21) + precio_base,
	subtotal = 0;
	int cantidad = 0;
	
	public producto() {
		this.nombre = "Pipas con sal";
		this.precio_base = 1;
		this.precio_iva = 0;
		this.cantidad = 1;
		this.subtotal = 0;
	}
	
	public producto(String nombr, double precio) {
		this.nombre = nombr;
		this.precio_base = precio;
		this.precio_iva = 0;
		this.cantidad = 0;
		this.subtotal = 0;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public double getPrecio_iva() {
		return precio_iva;
	}

	public void setPrecio_iva(double precio_iva) {
		this.precio_iva = precio_iva;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void calcular() {							
		this.subtotal = this.precio_base * this.cantidad;
		System.out.println("El subtotal de comprar " + this.nombre + " " + this.cantidad + " son " + this.subtotal + " euros.");
		
		double iva = this.subtotal * 0.21;
		System.out.println("El IVA total son " + iva + " euros" );
		
		this.precio_iva = this.subtotal + iva;
		System.out.println("El precio total con IVA son " + this.precio_iva + " euros");
		
	}
}
