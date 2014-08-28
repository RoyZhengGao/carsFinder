/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carsFinder.action;

import com.carsFinder.entity.CarInfo;
import com.carsFinder.model.CarsBean;
import com.carsFinder.model.RecommendCars;
import com.carsFinder.twitter.MainAction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import vo.StatusVO;

/**
 *
 * @author xmrui_000
 */
public class CarlistServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	try{
            String method=request.getParameter("method").trim();

            CarsBean carsBean = new CarsBean();		
            RecommendCars recommendCar=new RecommendCars();
            //HttpSession session = request.getSession();
            if(method.equals("searchCar")){
            String make=request.getParameter("make").trim();
            String model=request.getParameter("model").trim();
            String year=request.getParameter("year").trim();
                        String price=request.getParameter("price").trim();
            List tags = new ArrayList();
            tags.add(make);
            tags.add(model);
            
            MainAction mainA=new MainAction();
            mainA.setS1(make);
            mainA.setS2(model);
            mainA.excuteSearch();
            List<StatusVO> good_twitter=mainA.getTop5GoodStatus();
            List<StatusVO> bad_twitter=mainA.getTop5BadStatus();
            List<String> urls_flicter=mainA.getPhotoUrls();
            List<CarInfo> recomdCar=null;
            if(year!=null){
                System.out.println("year:"+year);
                recomdCar=recommendCar.getCarlist(make, model, year);
            }
            else{
                System.out.println("start recommend");
                recomdCar=recommendCar.getCarlist(make, model);
            }
            List<CarInfo> carList = carsBean.getCarlist(make, model,year,price);
          
            
            request.setAttribute("make", make);
            request.setAttribute("model", model);
            request.setAttribute("tags", tags);
            //request.setAttribute("urls_flicter",urls_flicter);
            request.setAttribute("goodtwitte", good_twitter);
            request.setAttribute("badtwitte", bad_twitter);
            request.setAttribute("carList", carList);
            request.setAttribute("recomdcar", recomdCar);
            request.getRequestDispatcher("/listBoard.jsp").forward(request, response);
        }
                                          
                        
        }catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		} finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
