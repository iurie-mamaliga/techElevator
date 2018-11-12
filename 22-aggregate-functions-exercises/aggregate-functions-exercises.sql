-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)
SELECT (name || ', ' || district) AS name_and_state, population
from city
WHERE district IN ('Pennsylvania', 'West Virginia', 'Kentucky', 'Indiana', 'Michigan')
ORDER BY district, name
LIMIT 100;


-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)
SELECT (name || ' (' || code || ')') AS country_and_code, region
from country
WHERE continent IN('Africa')
LIMIT 100;

-- 3. The per capita GNP (i.e. GNP multipled by 1000000 then divided by population) of all countries in the 
-- world sorted from highest to lowest. Recall: GNP is express in units of one million US Dollars 
-- (highest per capita GNP in world: 37459.26)
SELECT (gnp * 1000000 / population) AS per_capita_gnp, name
FROM country
WHERE population != 0
ORDER BY per_capita_gnp DESC
LIMIT 100;

-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)
SELECT AVG(lifeexpectancy) AS average_life_expectancy_south_america
FROM country
WHERE continent IN('South America')
LIMIT 100;

-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)
SELECT SUM(population) AS population_of_california
FROM city
WHERE district IN('California')
LIMIT 100;

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)
SELECT SUM(population) AS population_of_china
FROM city
WHERE countrycode = 'CHN'
LIMIT 100;

-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)
SELECT population, name
FROM country
ORDER BY population DESC
LIMIT 100;

-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)
SELECT population, name
FROM CITY
ORDER BY population DESC
LIMIT 100;

-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)
SELECT population, name
FROM city
WHERE countrycode = 'AUS'
ORDER BY population DESC
LIMIT 100;

-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)
SELECT population, name
FROM country
WHERE population != 0
ORDER BY population ASC
LIMIT 100;

-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)
SELECT AVG(population) AS average_city_population_in_usa
FROM city
WHERE countrycode ='USA'
LIMIT 100;

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)
SELECT AVG(population) AS average_city_population_in_china
FROM city
WHERE countrycode ='CHN'
LIMIT 100;

-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")
SELECT SUM(surfacearea) AS continent_area, continent
FROM country
GROUP BY continent ORDER BY continent_area DESC
LIMIT 100;

-- 14. The highest population density (population divided by surface area) of all 
-- countries in the world. 
-- (highest population density in world: 26277.7777)
SELECT (population / surfacearea) AS population_density, name AS country
FROM country
GROUP BY population_density, country ORDER BY population_density DESC
LIMIT 100;

-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 166.6666, "Andorra")
SELECT lifeexpectancy, (population / surfacearea) AS population_density, name AS country
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY lifeexpectancy, population_density, country ORDER BY lifeexpectancy DESC
LIMIT 10;

-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")
SELECT (gnpold - gnp) AS gnp_difference,ABS(gnpold - gnp) AS absolute_gnp_difference, name AS country
FROM country
GROUP BY gnp_difference, absolute_gnp_difference, country ORDER BY absolute_gnp_difference ASC

-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")
SELECT AVG(population) AS average_city_population, countrycode
FROM city
GROUP BY countrycode ORDER BY average_city_population desc
LIMIT 500;
-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)
SELECT COUNT(name) AS number_of_cities, district AS state
FROM city
WHERE countrycode = 'USA'
GROUP BY state ORDER BY state ASC
LIMIT 500;

-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")
SELECT COUNT(name) AS number_of_countries, continent
FROM country
GROUP BY continent ORDER BY number_of_countries DESC
LIMIT 500;

-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")
SELECT COUNT(name) AS number_of_cities, countrycode
FROM city
GROUP BY countrycode ORDER BY number_of_cities DESC
LIMIT 500;

-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")
SELECT MAX(population) AS largest_city, countrycode
FROM city
GROUP BY countrycode ORDER BY largest_city DESC
LIMIT 500;

-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")
SELECT AVG(lifeexpectancy) AS average_life_expectancy, MIN(lifeexpectancy) AS minimum_life_expectancy, MAX(lifeexpectancy) AS maximum_life_expectancy, continent
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent ORDER BY minimum_life_expectancy ASC
LIMIT 500;