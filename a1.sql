SELECT count(*) FROM contacts;
SELECT count(*) FROM austin_ryer;
SELECT count(*) FROM warehouses;
SELECT first_name, last_name,email FROM contacts;
SELECT first_name, last_name,email FROM employees;
SELECT * FROM customers
where customer_id=(SELECT min(customer_id) FROM customers);
SELECT min(standard_cost),max(standard_cost),avg(standard_cost) FROM products;
SELECT min(list_price),max(list_price),avg(list_price) FROM products;
SELECT avg(list_price) FROM products
where category_id=1;
SELECT min(list_price),min(standard_cost)FROM products
where category_id=2;
select product_name FROM products
where category_id=2
order by product_name;
select COUNT(product_name) from products
where category_id=3;
select COUNT(product_name) from products
group by category_id;
select sum(COUNT(product_name)) from products
group by category_id;
select * from orders
WHERE customer_id=2 and status='Pending';
SELECT * FROM orders
where status='Pending' and customer_id in (1,2,3);
SELECT * FROM orders
where status='Pending' and (customer_id=1 or customer_id=2 or customer_id=3)
order by customer_id;
SELECT * FROM warehouses
where warehouse_name like 'S%';
SELECT * FROM warehouses
where warehouse_name like '%y';
SELECT category_id FROM product_categories
where category_id not in 
(SELECT DISTINCT category_id FROM products);
SELECT * FROM customers
WHERE customer_id BETWEEN 5 and 10;
SELECT * FROM products
where standard_cost<=100
ORDER by standard_cost;
SELECT avg(list_price) FROM products
WHERE list_price<100;
SELECT * FROM products
WHERE category_id=5 or category_id=4
order BY standard_cost DESC;