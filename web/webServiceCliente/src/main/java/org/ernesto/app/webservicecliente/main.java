package org.ernesto.app.webservicecliente;

import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import javax.xml.rpc.Call;


public class main {
    public static void main(String[] args) {
        Service service = new Service();
        Call call;
        
        try {
            call = (Call) service.createCall();
            String ws_url = "http://webprod.com/webservice/server.php";
            call.setTargetEndpointAddress(ws_url);
            call.setOperationName(new QName("http://schemas.xmlsoap.org/wsdl/","calculadora"));
            QName QNAME_TYPE_STRING = new QName("string");
            call.addParameter("x", QNAME_TYPE_STRING, ParameterMode.IN);
            call.addParameter("y", QNAME_TYPE_STRING, ParameterMode.IN);
            call.addParameter("operacion", QNAME_TYPE_STRING, ParameterMode.IN);
            String[] params = {"10","20","divide"};
            String response = (String) call.invoke(params);
            System.out.println(response);
            
        } catch (ServiceException e) {
            e.printStackTrace();
        }catch (RemoteException e){
            e.printStackTrace();
        }
        
    }
}
