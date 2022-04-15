-- 1) 탈퇴하지 않은 고객 아이디와 이름, 등급 조회.
select customer_id as '고객 아이디', customer_name as '이름', grade as '등급'
from customer c
where is_use = false

-- 2) '2021-12-09' 이후에 가입한 고객 수 조회.
select count(create_at) as '고객 수' 
from customer c
where create_at >= '2021-12-09'

-- 3) 구매이력이 있는 고객 아이디와, 이름, 구매날짜, 비용 조회.
select c.customer_name as '고객 아이디' , c.customer_name as '이름' , chp.create_at as '구매날짜' , sum(chp.cost) as '비용' 
from customer_history_purchase chp left join customer c 
using (customer_id)
group by customer_id

-- 4) 등록된 고객 중 한 번도 구매 이력이 없는 고객 아이디, 이름, 회원 탈퇴 여부 조회.
select c.customer_id as '고객 아이디', c.customer_name as '이름', c.is_use  as '회원 탈퇴 여부' 
from customer_history_purchase chp right join customer c 
on c.customer_id = chp.customer_id
where chp.history_no is null

-- 5) '2022-01-03'기준 고객 아이디별 구매 건수와 총 비용, 이름, 등급 조회.
select count(chp.create_at) as '구매 건수', sum(chp.cost) as '총 비용', c.customer_name as '이름', c.grade  as '등급'
from customer_history_purchase chp left join customer c 
on c.customer_id = chp.customer_id
where chp.create_at = '2022-01-03'
group by chp.customer_id 

-- 6) '2022-01-03'기준 3번 이상 구매한 고객 아이디, 이름, 등급 조회.
select c.customer_id as '고객 아이디', c.customer_name as '이름', c.grade  as '등급'
from customer_history_purchase chp left join customer c 
on c.customer_id = chp.customer_id
where chp.create_at = '2022-01-03'
group by chp.customer_id 
having count(chp.customer_id) >= 3

-- 7) 고객번호가 5194998인 고객 등급을 골드로 업데이트 하시오.
update customer
set grade = '골드'
where customer_id = '5194998'