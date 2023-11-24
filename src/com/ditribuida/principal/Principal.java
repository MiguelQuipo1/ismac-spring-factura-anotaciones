package com.ditribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Factura factura = context.getBean("factura",Factura.class);
		Producto producto = context.getBean("producto",Producto.class);
		DetalleFactura facturaDetalle = context.getBean("detalleFactura",DetalleFactura.class);
		DatosEmpresa datosEmpresa = context.getBean("datosEmpresa",DatosEmpresa.class);
		
		cliente.setIdCliente(1);
		cliente.setCedula(1245876532);
		cliente.setNombre("Manuel");
		cliente.setApellido("gg");
		cliente.setEdad(10);
		cliente.setFechaNacimiento("11/23/2012");
		
		producto.setIdProducto(1);
		producto.setNombre("Laptop HP");
		producto.setDescripcion("AB sertify");
		producto.setPrecio(1200.50);
		producto.setStock(100);
		
		//FACTURA DETALLE
		facturaDetalle.setCantidad(2);
		producto.setStock(producto.getStock()
				-facturaDetalle.getCantidad());
		facturaDetalle.setIdDetalleFactura(1);

		//FACTURAS
		factura.setFecha("16/11/2023");
		factura.setIdFactura(1);
		factura.setIva(1.12);
		factura.setTotalNeto(producto.getPrecio()*
				facturaDetalle.getCantidad()+
				producto.getPrecio()*
				facturaDetalle.getCantidad()
				+producto.getPrecio()
				*facturaDetalle.getCantidad());
		
		factura.setTotal(factura.getTotalNeto()
				*factura.getIva());
		
		//IMPRIMIR
	
		System.out.println(cliente.toString());
		System.out.println(factura.toString());
		System.out.println(facturaDetalle.toString());
		System.out.println(producto.toString());
		System.out.println(datosEmpresa.toString());
		
		context.close();

 }
}
