create database library;
use library;

create table sach (
MASACH int primary key AUTO_INCREMENT,
TENSACH varchar(100) not null,
GIA float not null,
SOLUONG int not null
);

insert into sach (TENSACH, GIA, SOLUONG) values ('Thanh xuân đáng giá bao nhiêu', 80000, 10);
insert into sach (TENSACH, GIA, SOLUONG) values ('Cho tôi xin một vé đi tuổi thơ', 100000, 5);
insert into sach (TENSACH, GIA, SOLUONG) values ('7 thói quen hiệu quả', 199000, 7);
insert into sach (TENSACH, GIA, SOLUONG) values ('Đàn ông sao hoả, đàn bà sao kim', 150000, 10);
insert into sach (TENSACH, GIA, SOLUONG) values ('Con mèo dạy hải âu bay', 26000, 20);