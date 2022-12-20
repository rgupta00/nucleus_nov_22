package com.customerapp.web.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.customerapp.dao.country.Country;
import com.customerapp.dao.country.CountryDao;
import com.customerapp.dao.country.CountryDaoImpl;
import com.customerapp.dao.country.State;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/webapp1/ajax?operation=state&id=1
//http://localhost:8080/webapp1/ajax?operation=country
public class AjaxController extends HttpServlet {

    private CountryDao  countryDao=new CountryDaoImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {

            String op = request.getParameter("operation");
            if (op.equals("country")) {
                List<Country> clist = countryDao.getAllCounties();
                Gson json = new Gson();
                String countryList = json.toJson(clist);
                response.setContentType("text/html");
                response.getWriter().write(countryList);
            }

            //http://localhost:8080/webapp1/ajax?operation=state&id=1
            if (op.equals("state")) {
                int id = Integer.parseInt(request.getParameter("id"));
                List<State> slist = countryDao.getStateByCountryId(id);
                Gson json = new Gson();
                String countryList = json.toJson(slist);
                response.setContentType("text/html");
                response.getWriter().write(countryList);
            }

        }
    }
}







