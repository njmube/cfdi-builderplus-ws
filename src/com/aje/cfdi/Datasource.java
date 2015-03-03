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

public class Datasource extends DefaultHandler {
	String xmlFileName;
	String tmpValue;
	String dbHost;
	String dbName;
	String dbUser;
	String dbPassword;
	String rfc;
	OperatingSystem OS = new OperatingSystem();
	Boolean fHost;
	Boolean fDbName;
	Boolean fDbUser;
	Boolean fDbPassword;
	Boolean fRfc;

	public Datasource(String compania) {
		ResourcePath resource = new ResourcePath(this);

		// Debe ejecutarse la clase dentro del home del proyecto
		if (OS.isWindows()) {
			this.xmlFileName = resource.getWEBINFpath()
					+ "\\conf\\datasource\\DS" + compania.trim() + ".xml"; // Windows
		}
		if (OS.isUnix()) {
			this.xmlFileName = resource.getWEBINFpath() + "/conf/datasource/DS"
					+ compania.trim() + ".xml";// Linux
		}
		parseDocument();
	}

	private void parseDocument() {
		// parse
		SAXParserFactory factory = SAXParserFactory.newInstance();
		fHost = false;
		fDbName = false;
		fDbUser = false;
		fDbPassword = false;
		fRfc = false;

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

		if (elementName.equalsIgnoreCase("host")) {
			fHost = true;
		}
		if (elementName.equalsIgnoreCase("dbName")) {
			fDbName = true;
		}
		if (elementName.equalsIgnoreCase("user")) {
			fDbUser = true;
		}
		if (elementName.equalsIgnoreCase("password")) {
			fDbPassword = true;
		}
		if (elementName.equalsIgnoreCase("RFC")) {
			fRfc = true;
		}

	}

	@Override
	public void endElement(String s, String s1, String element)
			throws SAXException {
		// if end of book element add to list

	}

	@Override
	public void characters(char[] ac, int i, int j) throws SAXException {

		if (fHost) {
			this.dbHost = new String(ac, i, j);
			fHost = false;
		}
		if (fDbName) {
			this.dbName = new String(ac, i, j);
			fDbName = false;
		}
		if (fDbUser) {
			this.dbUser = new String(ac, i, j);
			fDbUser = false;
		}
		if (fDbPassword) {
			this.dbPassword = new String(ac, i, j);
			fDbPassword = false;
		}
		if (fRfc) {
			this.rfc = new String(ac, i, j);
			fRfc = false;
		}
	}

	public String getDbHost() {
		return dbHost;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

}