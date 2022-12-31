package ar.com.codoacodo.dto;

import java.util.Date;

public class Producto {
	private Long idProducto; 
	private String nombre;
	private Float precio;
	private Date fecha; 
	private String imagen; 
	private String codigo;
	private String color;
	private String stock;
	
	public Producto(Long idProducto, String nombre, Float precio, Date fecha, String imagen, String codigo, String color, String stock) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.imagen = imagen;
		this.codigo = codigo;
		this.color = color;
		this.stock = stock;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
}