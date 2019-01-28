package parking;
 
import java.util.ArrayList;
import java.util.List;
  
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ParkingSpaceDAO {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveParkingSpace(ParkingSpace parkingSpace) {
		template.save(parkingSpace);
	}

	public void updateParkingSpace(ParkingSpace parkingSpace) {
		template.update(parkingSpace);;
	}

	public void updateParkingSpaceById(int id) {
		template.update(template.get(ParkingSpace.class, id));
	}

	public void deleteParkingSpace(int id) {
		template.delete(template.get(ParkingSpace.class, id));
	}

	// TODO co tu siê wyda¿y³o???
	public ParkingSpace getParkingSpaceById(int id) {
		ParkingSpace parkingSpace = (ParkingSpace) template.get(ParkingSpace.class, id);
		return parkingSpace;
	}

	public List<ParkingSpace> getParkingSpace() {
		List<ParkingSpace> allParkingSpaceList = new ArrayList<ParkingSpace>();
		allParkingSpaceList = template.loadAll(ParkingSpace.class);
		return allParkingSpaceList;
	}
}
