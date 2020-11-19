#task 1
USE sakila;
SELECT * FROM actor;
SELECT * FROM actor WHERE last_name = "CAGE";
SELECT * FROM actor WHERE NOT first_name IN ("ZERO", "NICK");
SELECT * FROM actor WHERE first_name IN ("NICK", "JOHNNY", "JAMES", "MORGAN", "WHOOPI");
SELECT * FROM actor WHERE actor_id BETWEEN 50 and 150;
SELECT * FROM actor WHERE first_name LIKE "C%";
SELECT * FROM actor order by first_name;
SELECT * FROM actor order by last_name desc;
select count(*) from actor;
select count(distinct first_name) from actor ;
select * from film where film_id in (select film_id from film_category where category_id = (select category_id from category where name = "horror"));
select title as name from film where film_id in (select film_id from film_category where category_id = (select category_id from category where name = "horror"));

#task 2
insert into actor (first_name, last_name) values ("Mathias", "jensen");
select * from actor;
insert into film_actor (actor_id, film_id) values (201,1), (201,2), (201,3), (201,4), (201,5);
select * from film_actor where actor_id = 201;
update actor set first_name = "død", last_name = "baby" where actor_id = 201;
set foreign_key_checks = 0;
delete from actor where actor_id = 201;
set foreign_key_checks = 1;

#task 3
select * from category where name = "horror";
SELECT * FROM film JOIN film_category ON film.film_id = film_category.film_id WHERE category_id = 11;

#task 4
select count(*) from city;
select * from city where Population > 5000000;