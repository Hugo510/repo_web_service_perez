/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package perez_recu;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author Hugo
 */
@WebService(serviceName = "recu_perez_web_operaciones_9")
public class recu_perez_web_operaciones_9 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "masa")
    public double masa(
        @WebParam(name = "densidad") double densidad,
        @WebParam(name = "volumen") double volumen) {
        double masa = densidad*volumen;
        return masa;  
   
    }
}
