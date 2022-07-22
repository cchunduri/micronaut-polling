create table `mp-polling`.user
(
    user_id bigint auto_increment primary key
);

create table `mp-polling`.mn_poll
(
    poll_id      bigint auto_increment primary key,
    poll_desc    varchar(255) null,
    poll_name    varchar(255) null,
    poll_creator bigint       null,
    constraint creator_fk
        foreign key (poll_creator) references `mp-polling`.user (user_id)
);

