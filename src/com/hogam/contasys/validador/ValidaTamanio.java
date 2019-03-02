/**
 * 
 */
package com.hogam.contasys.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Representa el validador personalizado para manejar los tamanios
 * 
 * @author Usuario
 *
 */
@FacesValidator("valTamPer")
public class ValidaTamanio implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent contexto, Object valor) throws ValidatorException {

		if (valor != null & !valor.equals("")) {

			if (valor.toString().length() < 5) {
				FacesMessage mensaje = new FacesMessage();
				mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
				mensaje.setSummary("Valor incorrecto, minimo 5 caracteres");
				throw new ValidatorException(mensaje);
			}

		}

	}

}
