package parking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpaceService {

	private final ParkingSpaceDAO parkingSpaceDAO;

	@Autowired
	ParkingSpaceService(ParkingSpaceDAO parkingSpaceDAO) {
		this.parkingSpaceDAO = parkingSpaceDAO;
	}

	public void setTemplate(HibernateTemplate template) {
		parkingSpaceDAO.setTemplate(template);
	}

	public void saveParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaceDAO.saveParkingSpace(parkingSpace);
	}

	public void updateParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaceDAO.updateParkingSpace(parkingSpace);
	}

	public void deleteParkingSpace(int id) {
		parkingSpaceDAO.deleteParkingSpace(id);
	}

	public ParkingSpace getParkingSpaceById(int id) {
		return parkingSpaceDAO.getParkingSpaceById(id);
	}

	public List<ParkingSpace> getParkingSpaceList() {
		return parkingSpaceDAO.getParkingSpaceList();
	}

}
