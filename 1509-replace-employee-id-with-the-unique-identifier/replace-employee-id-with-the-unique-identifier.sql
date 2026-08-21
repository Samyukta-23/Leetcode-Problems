-- Write your PostgreSQL query statement below
select unique_id, name
from employeeUNI right join Employees on Employees.id=EmployeeUNI.id;