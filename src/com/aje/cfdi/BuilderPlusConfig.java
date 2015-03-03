/* Clase    : Connection
 * Autor    : Wilmer Reyes Alfaro
 * Revision : 22/06/2013 12:45
 * Funcion  : Permite obtener la cadena de conexi�n hacia la base de datos APM. 
 * 			  Se obtiene a partir del archivo config.xml de la carpeta conf del proyecto.
 * */
package com.aje.cfdi;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.aje.cfdi.common.OperatingSystem;
import com.aje.cfdi.common.ResourcePath;

public class BuilderPlusConfig extends DefaultHandler {
	String xmlFileName;
	String tmpValue;
	String wsUrl;
	String wsUser;
	String wsPassword;
	OperatingSystem OS = new OperatingSystem();
	Boolean fUrl;
	Boolean fUser;
	Boolean fPassword;

	public BuilderPlusConfig() {
		ResourcePath resource = new ResourcePath(this);

		this.xmlFileName = resource.getWEBINFpath() + OS.getOSPathDelimiter()
				+ "conf" + OS.getOSPathDelimiter() + "BuilderPlusConfig.xml";

		parseDocument();
	}

	private void parseDocument() {
		// parse
		SAXParserFactory factory = SAXParserFactory.newInstance();
		fUrl = false;
		fUser = false;
		fPassword = false;

		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(this.xmlFileName, this);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error: " + e.getMessage());
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed: "
					+ e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void startElement(String s, String s1, String elementName,
			Attributes attributes) throws SAXException {

		if (elementName.equalsIgnoreCase("url")) {
			fUrl = true;
		}
		if (elementName.equalsIgnoreCase("user")) {
			fUser = true;
		}
		if (elementName.equalsIgnoreCase("password")) {
			fPassword = true;
		}

	}

	@Override
	public void endElement(String s, String s1, String element)
			throws SAXException {
		// if end of book element add to list

	}

	@Override
	public void characters(char[] ac, int i, int j) throws SAXException {
		if (fUrl) {
			this.setWsUrl(new String(ac, i, j));
			fUrl = false;
		}
		if (fUser) {
			this.setWsUser(new String(ac, i, j));
			fUser = false;
		}
		if (fPassword) {
			this.setWsPassword(new String(ac, i, j));
			fPassword = false;
		}
	}

	public String getWsUrl() {
		return wsUrl;
	}

	public void setWsUrl(String wsUrl) {
		this.wsUrl = wsUrl;
	}

	public String getWsUser() {
		return wsUser;
	}

	public void setWsUser(String wsUser) {
		this.wsUser = wsUser;
	}

	public String getWsPassword() {
		return wsPassword;
	}

	public void setWsPassword(String wsPassword) {
		this.wsPassword = wsPassword;
	}
}
