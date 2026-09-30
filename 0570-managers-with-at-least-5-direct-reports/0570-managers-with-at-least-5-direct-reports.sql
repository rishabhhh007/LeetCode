# Write your MySQL query statement below
select e.name from Employee e inner join Employee ee on e.id=ee.managerId group by
ee.managerId having count(ee.managerId)>=5;