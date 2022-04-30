select e.product_name from ORDERS e
join CUSTOMERS c on c.id = e.customer_id
where lower(c.name) = lower(:name);

-- create index index_id_CUSTOMERS
-- on CUSTOMERS (id);
--
-- create index index_customer_id_ORDERS
-- on ORDERS (customer_id);