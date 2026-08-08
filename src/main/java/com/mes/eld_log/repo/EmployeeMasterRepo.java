package com.mes.eld_log.repo;

import com.mes.eld_log.dtos.DriverInfoViewDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterListViewDto;
import com.mes.eld_log.dtos.EmployeeMasterViewDto;
import com.mes.eld_log.models.EmployeeMaster;
import java.util.List;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMasterRepo extends MongoRepository<EmployeeMaster, String> {
   @Query("{ 'employeeId' : ?0 }")
   EmployeeMaster findByEmployeeId(Integer employeeId);

   @Query("{ 'email' : ?0 }")
   EmployeeMaster findEmployeeByEmail(String email);

   @Query("{ 'email' : ?0 }")
   EmployeeMasterCRUDDto findEmployeeByEmail1(String email);

   @Query("{ 'employeeId' : ?0 }")
   EmployeeMasterCRUDDto findEmployeeByEmployeeId1(Integer employeeId);

   @Query("{ 'employeeId' : ?0, 'clientId' : ?1 }")
   List<EmployeeMasterViewDto> findAndViewByEmployeeId(Integer employeeId, long clientId);

   @Query("{ 'isFirstLogin' : ?0, 'clientId' : ?1 }")
   List<EmployeeMasterViewDto> findAndViewByEmployeeIdAndFirstLogin(String isFirstLogin, long clientId);

   @Query("{ 'employeeId' : ?0 }")
   List<DriverInfoViewDto> findAndViewByDriverId(Integer employeeId);

   @Query("{}")
   List<DriverInfoViewDto> findAndViewByDrivers();

   @Query(
      value = "{ 'clientId' : ?0}",
      sort = "{'addedTimestamp': -1}"
   )
   List<EmployeeMasterViewDto> findAllEmployees(long clientId);

   @Query(
      value = "{ 'clientId' : ?0}",
      sort = "{'addedTimestamp': -1}"
   )
   List<EmployeeMasterListViewDto> findAllEmployeeByClient(long clientId);

   @Aggregation(
      pipeline = {"{$group: { _id: '', maxID: {$max: $employeeId }}}"}
   )
   Object findMaxIdInEmployeeMaster();

   @Query(
      value = "{'employeeId' : ?0}",
      delete = true
   )
   EmployeeMaster DeleteEmployeeById(Integer employeeId);

   boolean existsByEmail(String email);

   boolean existsByMobileNo(long mobileNo);

   @Query("{ 'cdlNo' : { $regex : '^?0$', $options: 'i' }, 'clientId' : ?1 }")
   List<EmployeeMaster> findByCdlNoAndClientId(String cdlNo, long clientId);

   @Query("{ 'cdlNo' : { $regex : '^?0$', $options: 'i' }, 'clientId' : ?1, 'employeeId' : { $ne: ?2 } }")
   List<EmployeeMaster> findByCdlNoAndClientIdAndNotEmployeeId(String cdlNo, long clientId, Integer employeeId);
}
