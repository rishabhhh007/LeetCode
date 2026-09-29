# Write your MySQL query statement below
select t.id from Weather t cross join Weather y  where DATEDIFF(t.recordDate,y.recordDate)=1 and t.temperature>y.temperature;