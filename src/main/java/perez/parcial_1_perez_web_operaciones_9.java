/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package perez;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author Hugo
 */
@WebService(serviceName = "parcial_1_perez_web_operaciones_9")
public class parcial_1_perez_web_operaciones_9 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "parcial")
    public double parcial(
        @WebParam(name = "voltaje") double voltaje,
        @WebParam(name = "resistencia") double resistencia) {
        double intensidad = voltaje/resistencia;
        return intensidad;  
   
    }
    }
