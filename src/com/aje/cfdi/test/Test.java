package com.aje.cfdi.test;

import com.aje.cfdi.WSBuilderPlus;

public class Test {

	public static void main(String[] args) {
		WSBuilderPlus builder = new WSBuilderPlus();
		String respuesta = null;
		respuesta = builder.cancelarCFDI("0030",
				"6D2BA454-6508-4F8C-AE41-C8233AAFF92B");
		System.out.println(respuesta);
	}

}
