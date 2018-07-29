package net.bootlab.myapp1.repositories;

import io.swagger.annotations.Api;
import net.bootlab.myapp1.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Event Entity")
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}