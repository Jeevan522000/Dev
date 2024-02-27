use hibernate;
create table friends
(id int,name varchar(20),age int, gender varchar(1),hometown varchar(20));

select * from friends order by id;

################################################################
delimiter //
create trigger check_age
before insert on friends
for each row
if new.age < 22 then set new.age = 50 ;
end if; //

# drop trigger check_age;
####################################################################

#insert query

insert into friends values 
(1,'Abhilash',25,'M','Satara'),
(2,'Omkar',26,'M','Satara'),
(3,'Sarpanch',24,'M','32 Shirala'),
(4,'Appa',26,'M','Chandoli'),
(5,'Kalyani',25,'F','Jalgaon'),
(6,'niraj',26,'M','Jalgaon'),
(7,'Ranu',22,'F','Jalgaon'),
(8,'MadhuraDidi',28,'F','Jalgaon');

insert into friends values 
(9,'Sachin',25,'M','Satara');
select * from friends order by id;

# truncate table friends;
##################################################################################

#Store Procedure for same homeTown Friends

delimiter //
create procedure same_HT(in ht varchar(20))
begin
  select *
  from friends 
  where hometown = ht;
  end ; //
  delimiter ;
  
  call same_HT('Jalgaon');
###################################################################################
  
  # Store procedure for friends with same age
  
  delimiter //
  create procedure same_age(in in_age int)
  begin
   select *
   from friends
   where age = in_age;
   end ; //
   delimiter ;
   
   call same_age(26);
   
########################################################################
   
   # Store Procedure for genderWise friends
   
   delimiter //
   create procedure gender(in in_gender varchar(1) , out total int)
   begin
   select *
   from friends
   where gender = in_gender;
    select count(*) into total
    from friends
    where gender = in_gender;
    end ; //
    delimiter ;
    
    call gender('f',@total);
    select @total as female;
    
###########################################################################
 
 # trigger to insert deleted record in new table
 
 create table exFriend
(id int,name varchar(20),age int,gender varchar(1),hometown varchar(20),removeDate timestamp default now());

delimiter //
create trigger removed_friend
before delete on friends
for each row
begin 
 insert into exFriend(id,name,age,gender,hometown)
 values(old.id,old.name,old.age,old.gender,old.hometown);
 end ;//
 delimiter ;
 
 delete from friends where name = 'sachin';
 
 # drop trigger removed_friend;
 
 select * from exFriend;
 

 