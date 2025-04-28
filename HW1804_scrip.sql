-- Tính tổng số tiền các sản phẩm user đã thêm vào giỏ hàng
select users.fullname, sum(price * quantity) as total_price
from users
    inner join carts on users.id = carts.user_id
    inner join cart_items on carts.id = cart_items.cart_id
    inner join products on cart_items.product_id = products.id
where users.role = 'user'
group by user_id;

-- Lấy ra danh sách ngừoi dùng đã từng có đơn hàng trên 50 nghìn
select users.fullname, users.email, users.role
from users
    inner join orders on users.id = orders.user_id
where orders.total_amount > 50000 and users.role = 'user';

-- Lấy ra danh sách các sản phẩm đã hết hàng trong kho
select *
from products
where stock =0;

-- Lấy ra danh sách nguời dùng và số lượng mặt hàng mặt hàng ngừoi đó đang có trong giỏ hàng
select users.fullname, sum(cart_items.quantity) as total_items
from users
    INNER join carts on users.id = carts.user_id
    INNER join cart_items on carts.id = cart_items.cart_id
where users.role = 'user'
group by cart_id;

-- Tính tổng tiền lãi thu được nếu bán hết hàng trong kho
select sum(price * stock) - sum(original_price * stock) as total_profit
from products
where stock > 0;



