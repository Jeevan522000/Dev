#stored Procedure

delimiter &&
create procedure dada()
begin
select * 
from hibernate.student
where name='omkar';
end &&
delimiter ;

call dada();

##################################################################

#Stored Procedure using IN parameter

delimiter //
create procedure max_age(in var int)
begin
select *
from student 
order by age desc limit var;
end //
delimiter ;

call max_age(2);

#stored procedure update query 

delimiter //
create procedure update_age(in temp_name varchar(20),in new_age int)
begin
update hibernate.student set age = new_age where name = temp_name;
end ; //

call update_age('omkar',27);

#################################################################################

# Stored Procedure OUT parameter

delimiter //
create procedure male_emp(out maleEmp int)
begin
select count(FirstName) into maleEmp from hibernate.employees where gender = 'male';
end ; //
delimiter ;

call male_emp(@M);
select @M as Male_Employees;