package dream.blog.practice.rest.service.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import dream.blog.practice.rest.service.model.Student;

@Path("student")
public interface StudentResource {
	
	@GET
	@Path("/list")
	@Produces("application/json")
	List<Student> getAllStudents();
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	Student getById(@PathParam("id") int id);
	
}
