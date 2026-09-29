# Write your MySQL query statement below
select e.name, ee.unique_id from Employees e Left Join EmployeeUNI ee on e.id=ee.id;