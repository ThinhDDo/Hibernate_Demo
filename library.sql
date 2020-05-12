create database library;
use library;

create table sach (
MASACH int primary key AUTO_INCREMENT,
TENSACH varchar(100) not null,
GIA float not null,
SOLUONG int not null
);

create table theloai (
MATHELOAI varchar(5) primary key,
TENTHELOAI varchar(100) not null
);

create table sach_theloai (
MASACH int not null,
MATHELOAI varchar(5) not null,
FOREIGN KEY (MASACH) REFERENCES sach(MASACH) on delete cascade on update cascade,
FOREIGN KEY (MATHELOAI) REFERENCES theloai(MATHELOAI) on delete cascade
);

-- Thêm dữ liệu sách
insert into sach (TENSACH, GIA, SOLUONG) values ('Thanh xuân đáng giá bao nhiêu', 80000, 10);
insert into sach (TENSACH, GIA, SOLUONG) values ('Cho tôi xin một vé đi tuổi thơ', 100000, 5);
insert into sach (TENSACH, GIA, SOLUONG) values ('7 thói quen hiệu quả', 199000, 7);
insert into sach (TENSACH, GIA, SOLUONG) values ('Đàn ông sao hoả, đàn bà sao kim', 150000, 10);
insert into sach (TENSACH, GIA, SOLUONG) values ('Con mèo dạy hải âu bay', 26000, 20);
insert into sach (TENSACH, GIA, SOLUONG) values ('Head-First Python', 150000, 5);
-- Thêm dữ liệu thể loại
insert into theloai values ('TL001', 'Văn học');
insert into theloai values ('TL002', 'Self-improvement');
insert into theloai values ('TL003', 'Truyện');
insert into theloai values ('TL004', 'Tham khảo');
-- Cập nhật bảng phát sinh
insert into sach_theloai values (1, 'TL001');
insert into sach_theloai values (2, 'TL003');
insert into sach_theloai values (3, 'TL002');
insert into sach_theloai values (4, 'TL002');
insert into sach_theloai values (5, 'TL003');
insert into sach_theloai values (6, 'TL004');