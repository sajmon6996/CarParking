package parking;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParkingSpaceController {

	@Autowired
	ParkingSpaceDAO parkingSpaceDAO;

	@RequestMapping("/add")
	public String showform(Model model) {
		model.addAttribute("command", new ParkingSpace());
		return "add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("parkingSpace") ParkingSpace parkingSpace) {
		parkingSpaceDAO.saveParkingSpace(parkingSpace);
		;
		return "redirect:/parkinglist";
	}

	@RequestMapping("/parkinglist")
	public String viewemp(Model model) {
		List<ParkingSpace> parkingSpaceList = parkingSpaceDAO.getParkingSpace();
		model.addAttribute("parkingSpaceList", parkingSpaceList);
		return "parkinglist";
	}

	@RequestMapping(value = "/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		ParkingSpace parkingSpace = parkingSpaceDAO.getParkingSpaceById(id);
		model.addAttribute("command", parkingSpace);
		return "parkingspaceedit";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("parkingSpace") ParkingSpace parkingSpace) {
		parkingSpaceDAO.updateParkingSpace(parkingSpace);
		;
		return "redirect:/parkinglist";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		parkingSpaceDAO.deleteParkingSpace(id);
		return "redirect:/parkinglist";
	}
}