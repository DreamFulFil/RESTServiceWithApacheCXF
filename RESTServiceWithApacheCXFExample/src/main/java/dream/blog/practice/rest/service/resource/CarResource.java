package dream.blog.practice.rest.service.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dream.blog.practice.rest.service.model.Car;

@Path("car")
public interface CarResource {

	@GET
	@Path("/list")
	@Produces("application/json")
	List<Car> getAllCars();
	
}
