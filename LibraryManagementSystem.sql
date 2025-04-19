-- 1.
select Book.title, Publisher.name
from Book_Invoice
    INNER join Book on Book_Invoice.book_id = Book.Book_Id
    INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
group by Book_Invoice.Book_Id
having count(Book_Invoice.Book_Id) >= 1;

-- 2.
select Publisher.name, count(Book_Id) as book_count
from Publisher
    inner join Book on Book.Pub_Id = Publisher.Pub_Id
group by Publisher.Pub_Id;

-- 3.
select Book.title, Publisher.name
from Book
    INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
group by Book.Book_Id, Book.Title, Book.Price
having  Book.Price > (select AVG(Price)
                      FROM Book);

-- 4.
select Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No, count(Book_Invoice.Book_Id) as book_count
from Member
    inner join Book_Invoice on Member.CardNo = Book_Invoice.CardNo
group by Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No;

-- 5.
select Book.title, Publisher.name, Book.Price
from Book
    INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
where Book.Price = (select max(Price)
                      from Book)
or    Book.Price = (select min(Price)
                      from Book);

-- 6.
select Publisher.name, COUNT(Book.Book_Id) as book_count
from Publisher
    INNER join Book on Publisher.Pub_Id = Book.Pub_Id
group by Publisher.Pub_Id;

-- 7.
-- Có bổ sung thêm cột Return_Date
select Book.title, Publisher.name
from Book
    INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
where Book_Id in (select Book_Id
                      from Book_Invoice
                      where
                          (Book_Invoice.Return_Date < Book_Invoice.Due_Date)
                      or
                          (Book_Invoice.Return_Date is null and Book_Invoice.Due_Date > curdate())
                      );

-- 8.
select Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No, count(Book_Invoice.Book_Id) as book_count
from Member
         inner join Book_Invoice on Member.CardNo = Book_Invoice.CardNo
group by Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No
order by book_count DESC;

-- 9.
select Publisher.Pub_Id , Publisher.name, count(Book.Book_Id) as book_count
from Publisher
    inner join Book on Publisher.Pub_Id = Book.Pub_Id
group by Book.Pub_Id
having count(Book.Book_Id) >= 2;

-- 10.
select Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No
from Member
    inner join Book_Invoice on Member.CardNo = Book_Invoice.CardNo
    inner join Book on Book_Invoice.Book_Id = Book.Book_Id
where Book.Type = 'crime story'
group by Member.CardNo, Member.Surname, Member.Name, Member.Address, Member.Birthday_Date, Member.Gender, Member.Phone_No
having count(Book_Invoice.Book_Id) >= 1;

-- 11.
-- Có bổ sung thêm cột Return_Date
select Book.title,
       Book_Invoice.Date_Out,
       DATEDIFF(
                if( Book_Invoice.Return_Date is null,  CURDATE() , Book_Invoice.Return_Date), Book_Invoice.Due_Date )
                as So_ngay_qua_han
from Book
    INNER join Book_Invoice on Book.Book_Id = Book_Invoice.Book_Id
where
    (Book_Invoice.Return_Date > Book_Invoice.Due_Date)
   or
    (Book_Invoice.Return_Date  is null and curdate() > Book_Invoice.Due_Date);

-- 12.
select Book.title, Publisher.name
from Book
    INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
where Book.Book_Id in ( select Book_Id
                        from Book_Invoice
                        where
                            (Book_Invoice.Return_Date > Book_Invoice.Due_Date and DATEDIFF(Book_Invoice.Return_Date, Book_Invoice.Due_Date) >7)
                            or
                            (Book_Invoice.Return_Date is null and Book_Invoice.Due_Date < curdate()));

--  13.
select curdate() as Now, count(Book_Invoice.Invoice_No) as Invoice_count
from Book_Invoice
where date(Date_Out) = curdate()
group by Emp_Id;

-- 14.
select Book.title,count(Book.Book_Id) as book_count
from Book
    INNER join Book_Invoice on Book.Book_Id = Book_Invoice.Book_Id
where Book.Book_Id in (select Book.Book_Id
                      from Book INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
                      where Publisher.City = 'Hanoi')

group by Book.Book_Id;

-- 15.
select Book.title, Book.price
from Book
INNER join Publisher on Book.Pub_Id = Publisher.Pub_Id
where Publisher.City = 'Hanoi'
    and(Book.Price < (select avg(Price)
                      from Book));

