package nvh.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import nvh.model.SinhVien;

@Controller
public class info_controller {	
	@GetMapping("/info")
	public String info(Model model) {
		SinhVien sv = new SinhVien("64139028", "Ngo Viet Hoang", 2004, "Nam");
		model.addAttribute("sv", sv);
		return "info";
	}
	
	public ArrayList<SinhVien> getData() {
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        dsSV.add(new SinhVien("64139028", "Ngo Viet Hoang", 2004, "Nam"));
        dsSV.add(new SinhVien("64139029", "Nguyen Van A", 2004, "Nam"));
        dsSV.add(new SinhVien("64139030", "Tran Thi B", 2004, "Nu"));
        
        return dsSV;
	}
	
	@GetMapping("/info2")
	public String info2(Model model) {
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        dsSV = getData();
        
    	model.addAttribute("dsSV", dsSV);
        return "info2";
	}
}
