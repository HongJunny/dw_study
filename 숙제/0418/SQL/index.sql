-- 1. 차량 수 조회
select count(car_number) as "차량 수"
from car_information


-- 2. 차량에 부착된 디바이스 uuid, battery, create_at 조회.
select carin.device_uuid as '디바이스 uuid', 
d.battery as battery, 
carin.create_at as create_at
from car_information carin left join devices d
on carin.device_uuid = d.device_uuid


-- 3. UUID '20130099', 배터리 100, 펌웨어 버전 '1.0.1', 사용여부 TRUE인 디바이스를 devices에 등록하시오.
INSERT INTO devices(device_uuid, battery, firmware_ver, is_use) VALUES('20130099', 100, '1.0.1', TRUE);


-- 4. 2022-04-11 이후 탈착 이벤트가 1건 이상 발생된 UUID, 펌웨어 버전 조회.





-- 5. 2022-04-11 ~ 2022-04-13 일별 이벤트 카운트 조회.
select date_format(create_at, '%Y-%m-%d') as '날짜', 
count(event_type) as '이벤트 카운트'
from car_event_log
where create_at > '2022-04-10'
and create_at < '2022-04-14'
group by date_format(create_at, '%Y-%m-%d')


-- 6. 전체 디바이스 수, 차량에 부착된 디바이스 수, 차량에 부착하지 않은 디바이스 수 조회.





-- 7. 차량번호 '359서 9096'의 2022-04-11 ~ 2022-04-13일까지 이벤트별 카운트 조회
select event_type, count(event_type) as '카운트'
from car_event_log
where car_number = '359서 9096'
and create_at > '2022-04-10'
and create_at < '2022-04-14'
group by event_type


-- 8. UUID가 '20133344'인 디바이스의 2022-04-11 ~ 2022-04-13에 발생한 이벤트타입, 이벤트 날짜, 차량번호판, 담당자 조회.
select care.event_type as "이벤트 타입", 
care.create_at as "이벤트 날짜", 
care.car_number as "차량 번호판", 
carin.admin_name as "담당자"
from car_event_log care left join car_information carin
on care.car_number = carin.car_number
where carin.device_uuid = '20133344'
and care.create_at > '2022-04-10'
and care.create_at < '2022-04-14'
