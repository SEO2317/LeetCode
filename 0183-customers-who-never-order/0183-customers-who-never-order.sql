# Write your MySQL query statement below
SELECT 
        Name as Customers
FROM
        Customers
WHERE
        Id
not in(
    select CustomerId from Orders
);