package com.aje.cfdi.test;

import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.ekomercio.edixcfdisecure.WSCFDBuilderPlusSoapProxy;

public class WSBuilderPlusTest {

  public static void main(String[] args) {

    try {
      WSCFDBuilderPlusSoapProxy proxy = new WSCFDBuilderPlusSoapProxy();
      String respuesta = "";

      respuesta = proxy.cancelarCFDI("CFDIAJE092_TXT", "@CFDIAJE09214_TXT", "AJE010718ET5",
          "6D2BA454-6508-4F8C-AE41-C8233AAFF92B");

      System.out.println(respuesta);

    } catch (AxisFault e1) {
      e1.printStackTrace();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
