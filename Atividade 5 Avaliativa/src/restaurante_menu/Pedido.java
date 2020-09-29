package restaurante_menu;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {
	
	private String codigo;
	private String observa��o;

	private List<Prato> pratos = new ArrayList<>();
	private List<Bebida> bebidas = new ArrayList<>();
	private List<Vinho> vinhos = new ArrayList<>();
	 
	public Pedido() {
	DateFormat df = new SimpleDateFormat("yyyymmddhhmmss");
	this.setCodigo(df.format(Calendar.getInstance().getTime()));
	}

	public List<Prato> getPratos(){
	return pratos;
	}
	 
	public void setPratos(List<Prato> pratos) {
	this.pratos = pratos;

	}

	public List<Bebida> getBebidas() {
	// TODO Auto-generated method stub
	return bebidas;
	}
	 

	public void setBebidas(List<Bebida> bebidas) {
	// TODO Auto-generated method stub
	this.bebidas = bebidas;
	}

	public List<Vinho> getVinhos() {
	// TODO Auto-generated method stub
	return vinhos;
	}

	public void setVinhos(List<Vinho> vinhos) {
	// TODO Auto-generated method stub
	this.vinhos = vinhos;
	}
	 
	public String getObserva��o() {
	// TODO Auto-generated method stub
	return observa��o;
	}

	public void setObserva��o(String observa��o) {
	// TODO Auto-generated method stub
	this.observa��o = observa��o;
	}

	public String getTotal() {
	// TODO Auto-generated method stub
	double valorTotal = 0;

	for (Prato prato : pratos) {
	valorTotal += prato.getPre�o();
	}

	for (Bebida bebida : bebidas) {
	valorTotal += bebida.getPre�o();
	}

	for (Vinho vinho : vinhos) {
	valorTotal += vinho.getPre�o();
	}
	 
	DecimalFormat df = new DecimalFormat("#,###.00");
	return df.format(valorTotal);
	}

	public String getCodigo() {
	// TODO Auto-generated method stub
	return codigo;
	}

	private void setCodigo(String codigo) {
	// TODO Auto-generated method stub
	this.codigo = codigo;
	}

}
