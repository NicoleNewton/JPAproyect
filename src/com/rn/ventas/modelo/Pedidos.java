package com.rn.ventas.modelo;

import java.util.Date;
import java.util.List;

public class Pedidos {
	private int id;
	private Clientes cliente;
	private List<Articulos> listaArticulos;
	private String formaDePago;
	private Date fecha;
	private int precioTotal;

}
