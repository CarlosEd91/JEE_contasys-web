/**
 * 
 */
package com.hogam.contasys.convertidor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * 
 * Representa el convertidor para el manejo de la informacion
 * 
 * @author Usuario
 *
 */

@FacesConverter("conMayPer")
public class ConvertidorMayuscula implements Converter {

	@Override
	public Object getAsObject(FacesContext contexto, UIComponent componente, String valor) {
		// TODO Auto-generated method stub
		String valorCon = null;
		if(valor != null && !valor.equals("")) {
			valorCon = valor.toUpperCase();
		}else {
			valorCon = "ACTUALIZAR";
		}
		
		return valorCon;
	}

	@Override
	public String getAsString(FacesContext contexto, UIComponent componente, Object valor) {
		// TODO Auto-generated method stub
		String valorCon = null;
		if(valor != null && !valor.equals("")) {
			valorCon = valor.toString().toUpperCase();
		}else {
			valorCon = "ACTUALIZAR";
		}
		
		return valorCon;
		
		
	}

}
