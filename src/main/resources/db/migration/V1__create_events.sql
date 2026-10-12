create table events (id bigint auto_increment primary key, title varchar(200) not null, starts_at timestamp not null, venue varchar(200), capacity integer not null check (capacity > 0));
