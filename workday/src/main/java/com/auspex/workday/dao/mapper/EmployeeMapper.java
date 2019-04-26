package com.auspex.workday.dao.mapper;

import com.auspex.workday.dao.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    /** select Employee
     * @param employeeId
     * @return
     */
    Employee select(int id);

    /** add Employee
     * @param Employee
     * @return
     */
    int insert(Employee employee);

    /** delete Employee
     * @param String
     * @return
     */
    int delete(String employeeId);
}
