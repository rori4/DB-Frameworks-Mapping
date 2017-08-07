package app.dto;

import app.model.Employee;
import org.modelmapper.ModelMapper;

public class DTOMappingUtil {
    private static ModelMapper mapper = new ModelMapper();
    public DTOMappingUtil() {
    }

    public static EmployeeDto convertEmployee(Employee employee){
        return mapper.map(employee,EmployeeDto.class);
    }

    public static Employee convertEmployeeDto(EmployeeDto employeeDto){
        return mapper.map(employeeDto,Employee.class);
    }

    public static <S,D> D convert(S source, Class<D> destClass){
        return mapper.map(source, destClass);
    }
}
