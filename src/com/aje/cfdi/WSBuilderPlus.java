package com.aje.cfdi;

import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.axis.AxisFault;

import com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapProxy;

public class WSBuilderPlus {

	private Datasource source;

	public WSBuilderPlus() {
	}

	public String cancelarCFDI(String compania, String UUID) {
		String respuesta = null;
		try {
			BuilderPlusConfig config = new BuilderPlusConfig();
			this.source = new Datasource(compania);

			// Consume WS BuilderPlus Ekomercio
			WSCFDBuilderPlusSoapProxy proxy = new WSCFDBuilderPlusSoapProxy();
			respuesta = proxy.cancelarCFDI(config.getWsUser(),
					config.getWsPassword(), source.getRfc(), UUID);

			updateDB(compania, UUID, respuesta);

		} catch (AxisFault e) {
			System.out.println("Axis Error: " + e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("Remote Error: " + e.getMessage());
			e.printStackTrace();
		}
		return respuesta;
	}

	private void updateDB(String compania, String UUID, String respuesta) {
		Connection con;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://"
					+ source.getDbHost().trim() + ":1433;" + "databaseName="
					+ source.getDbName().trim() + ";user="
					+ source.getDbUser().trim() + ";password="
					+ source.getDbPassword().trim() + ";");

			CallableStatement cstmt = con
					.prepareCall("EXEC USP_FEX_CFDI_REG_ACUSE_ANULACION ?,?,?");
			cstmt.setObject(1, compania.trim(), java.sql.Types.VARCHAR);
			cstmt.setObject(2, UUID.trim(), java.sql.Types.VARCHAR);
			cstmt.setObject(3, respuesta.trim(), java.sql.Types.VARCHAR);

			cstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found : " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
