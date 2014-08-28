/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carsFinder.model;

import com.carsFinder.dao.DBO;
import com.carsFinder.entity.CarInfo;
import com.carsFinder.entity.ModelInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xmrui_000
 */
public class CarsBean {
    private List list;
	private ResultSet rs = null;
        
        
        
            public List<ModelInfo> getMake() {
        String sql = "select distinct(make) from expertreview";
        DBO dbo = new DBO();
        dbo.open();
         List<ModelInfo> modelList = new ArrayList<ModelInfo>();
        try {
            rs = dbo.executeQuery(sql);
            while (rs.next()) {
                  ModelInfo modelInfo = new ModelInfo();
                modelInfo.setMake(rs.getString(1));
                modelList.add(modelInfo);
            }
            
            return modelList;
        } catch (Exception e) {
            return null;
        } finally {
            dbo.close();
        }
    }

    public List<ModelInfo> getModel(String make) {
        String sql = "select distinct model from expertreview where make ='" + make + "'";
        DBO dbo = new DBO();
        dbo.open();
         List<ModelInfo> modelList = new ArrayList<ModelInfo>();
        try {
            rs = dbo.executeQuery(sql);
            while (rs.next()) {
                  ModelInfo modelInfo = new ModelInfo();
                modelInfo.setModel(rs.getString(1));
                modelList.add(modelInfo);
            }
            
            return modelList;
        }catch (Exception e) {
            return null;
        } finally {
            dbo.close();
        }
    }
        
        public List<ModelInfo> getExpertReview(String make, String model,String year) {
        String sql = "select * from expertreview where make ='" + make + "' and model ='" + model + "' and year ='" + year + "'";
        DBO dbo = new DBO();
        dbo.open();
         List<ModelInfo> modelList = new ArrayList<ModelInfo>();
        try {
            rs = dbo.executeQuery(sql);
            while (rs.next()) {
                  ModelInfo modelInfo = new ModelInfo();
                modelInfo.setMake(rs.getString("make"));
                modelInfo.setModel(rs.getString("model"));
                modelInfo.setYear(rs.getString("year"));
                modelInfo.setExpertReview(rs.getString("expertreview"));
                modelList.add(modelInfo);
            }
            
            return modelList;
        }catch (Exception e) {
            return null;
        } finally {
            dbo.close();
        }
    }
        
        
        
        
        
        
        private int EVERYPAGENUM = 2;
        public void setEVERYPAGENUM(int EVERYPAGENUM){
    	this.EVERYPAGENUM=EVERYPAGENUM;
    }
          public int getPageCount() { //µÃµ½¹²¶àÉÙÒ³£¨¸ù¾ÝÃ¿Ò³ÒªÏÔÊ¾¼¸ÌõÐÅÏ¢£©
    	 int count = -1;
        if (count % EVERYPAGENUM == 0) {
            return count / EVERYPAGENUM;
        } else {
            return count / EVERYPAGENUM + 1;
        }
    }
        public List getCarlistByPage(String make, String model,int page) { 
            DBO dbo = new DBO();
            dbo.open();
            List list = new ArrayList();
            int qq = 0;
          try {
            rs = dbo.executeQuery("select * from record where carName like '%"+make+"%' and carName like '%"+model+"%' order by RecordID asc");
            for (int i = 0; i < (page - 1) * EVERYPAGENUM; i++) {
                rs.next();
            }
            for (int t = 0; t < EVERYPAGENUM; t++) {
                if (rs.next()) {
                    qq++;
                    List list2=new ArrayList();
                    list2.add(rs.getInt("id"));
    				list2.add(rs.getString("username"));
    				list2.add(rs.getString("password"));
    				list.add(list2);
                } else {
                    break; 
                }
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            dbo.close();
        }
        }
        
        
        public List<CarInfo>  getCarlist(String make, String model, String year, String price){
         //CarInfo carInfo = new CarInfo();
         DBO dbo = new DBO();
         dbo.open();
        List<CarInfo> carList = new ArrayList<CarInfo>();
         try{
              int priceMax = Integer.parseInt(price)+5000;
              String maxPrice = new Integer(priceMax).toString();
              rs = dbo.executeQuery("select * from record where carName like '%"+make+"%' and carName like '%"+model+"%' and year='"+year+"' order by RecordID asc");
              while(rs.next()){
              CarInfo carInfo = new CarInfo();
               carInfo.setRecordID(Integer.parseInt(rs.getString("RecordID")));
               carInfo.setCarName(rs.getString("carName"));
               carInfo.setYear(rs.getString("year"));
               carInfo.setColor(rs.getString("color"));
               carInfo.setImageUrl(rs.getString("imageUrl"));
               carList.add(carInfo);
              }
             
             return carList;
         }catch(SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            dbo.close();
        }

        }
        
        
}
