/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.designprimer;

import edu.escuelaing.arep.LinkedList.LinkedList;
import edu.escuelaing.arep.calculator.Calculator;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 *
 * @author esteb
 */
public class SparkWebApp {
    public static void main(String[] args) {
    port(getPort());
    get("/data", (req, res) ->  DataToCalculate(req, res));
    get("/results", (req, res) -> DataResult(req, res));
    }

    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
    return 4567;
    }
    
    
    private static String DataResult(Request req, Response res) {
        LinkedList Linked = new LinkedList();
        String[] DataInput = req.queryParams("Numbers").split(",");
        String Numb;
        for(String x:DataInput){
            Linked.add(Double.parseDouble(x));
        }
        Numb = "<!DOCTYPE html>" 
                +"<html>"
                +"<body>"
                + "<center>"
                + "<h2>"+"The results are as follows."+"<h2>"
                + "<h2>"+ "Result Mean: " + Calculator.Mean(Linked) + "<h2>"
                + "<h2>"+ "Result Standar Deviation: " + Calculator.Deviation(Linked) + "<h2>"
                + "</center>"
                + "</body>"
                + "</html>";
        return Numb;

    }                                                                                                       
    private static String DataToCalculate(Request req, Response res) {
        String pageContent
            = "<!DOCTYPE html>"
            + "<html>"
            + "<body>"
            + "<center>"
            + "<h2>Mean and Standar Deviation</h2>"
            + "<form action=\"/results\">"
            + "  Type the numbers separated by commas<br>"
            + "  <input type=\"text\" name=\"Numbers\" >"
            + "  <br><br>"
            + "  <input type=\"submit\" value=\"Calculate\">"
            + "</form>"
            + "</center>"
            + "</body>"
            + "</html>";
        return pageContent;
    }
    
}
