/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyFastFood.BUS;

import QuanLyFastFood.DAO.ThongKeDAO;
import QuanLyFastFood.DTO.ThongKe;

import java.util.ArrayList;

/**
 * @author User
 */
public class ThongKeBUS {

    public ThongKeDAO thongKeDAO = new ThongKeDAO();
    private ArrayList<Double> doanhThuThang;

    public ThongKe thongKe(int nam) {
        return thongKeDAO.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeDAO.getDoanhThuThang(thang, nam);
    }
}
