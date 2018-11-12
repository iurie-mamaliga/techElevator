-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor
(first_name, last_name)
VALUES ('Hampton', 'Avenue'),('Lisa','Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT INTO film
        (title, description, release_year, language_id, length)
VALUES  ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor
(film_id, actor_id)
VALUES (1001, 201), (1001, 204);

-- 4. Add Mathmagical to the category table.
INSERT INTO category
(category_id, name)
VALUES (17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--in order for each film to retain one category I inserted the new filma and updated the old films with new category.
insert into film_category
(film_id, category_id)
values(1001, 17);

UPDATE film_category
SET category_id = 17
WHERE film_id IN (274, 494, 714, 996);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN (1001, 274, 494, 714, 996);

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory 
(film_id, store_id)
VALUES (1001, 1), (1001, 2);



-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film
WHERE film_id = 1001;
--can't delete
--delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"



-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category
WHERE category_id = 17;
--can't delete
--delete on table "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category"



-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

DELETE FROM film_category
WHERE category_id = 17;

--succeeded because there are no constraints


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM category
WHERE category_id = 17;
--deleted Mathmagical because there are no constraints 

DELETE FROM film
WHERE film_id = 1001;
--can't delete the film
--delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"



-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

in order to be able to delete the the film we need to delete 2 records from film_actor table since
table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"