/*Select các bản ghi theo 3 giá trị category*/
SELECT * FROM products
WHERE category IN ('Phụ kiện', 'Laptop', 'Thiết bị mạng' )

/*Select các bản ghi có users fullname bắt đầu bằng "a"*/
SELECT * FROM users
WHERE fullname LIKE 'a%'

/*Viết truy vấn kiểm tra xem có bao nhiêu users có status là "ACTIVE*/
SELECT COUNT(*) from users
WHERE status in ('active')

/*Viết truy vấn kiểm tra xem có bao nhiêu product có stock <= 0*/
SELECT COUNT(*) from products
WHERE stock <=0

/*Lấy ra 10 products có giá cao nhất*/
SELECT * FROM products
ORDER BY price DESC
LIMIT 10